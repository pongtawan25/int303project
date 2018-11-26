/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rss.jpa.model.Product;

/**
 *
 * @author PONGTAWAN
 */
public class Cart implements Serializable {

private Map<String, LineItem> cart;
private int ship;
    
    public Cart() {
        cart = new HashMap();
    }
    
    public void add(Product p) {
        LineItem line = cart.get(p.getProductid());
        if (line == null) {
            cart.put(p.getProductid(), new LineItem(p));
        } else {
            line.setQuantity(line.getQuantity() + 1);
        }
    }
    
    public void remove(Product p) {
        this.remove(p.getProductid());
    }
    
    public void remove(String productCode) {
        cart.remove(productCode);
    }
    
    public int getTotalPrice(){
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum = sum + lineItem.getTotalPrice();
        }
        return sum;
    }
    
    //ขกสร้าง model ใหม่
    public int getEconomy(){
        return 100;
    }
    public int getEms(){
        return 150;
    }
    public int getKerry(){
        return 200;
    }
    public void setShippingPrice(int ship){
        this.ship = ship;
    }
    public int getShippingPrice(){
        Collection<LineItem> lineItems = cart.values();
        int sum = ((LineItem)lineItems).getTotalPrice();
        return sum + this.ship;
    }
    //------------
    
    public int getTotalQuantity(){
        int sum =0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum += lineItem.getQuantity();
        }
        return sum;
    }
    
    public List<LineItem> getLineItems(){
        return new ArrayList(cart.values());
    }
}
