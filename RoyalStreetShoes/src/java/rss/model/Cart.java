/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.model;

import java.io.Serializable;
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

    public void removeQuantity(Product p) {
        LineItem line = cart.get(p.getProductid());
        if (line.getQuantity() > 0) {
            line.setQuantity(line.getQuantity() - 1);
        }
    }

    public int getTotalPrice() {
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum = sum + lineItem.getTotalPrice();
        }
        return sum;
    }

    public int getTotalQuantity() {
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum += lineItem.getQuantity();
        }
        return sum;
    }

    public List<LineItem> getLineItems() {
        return new ArrayList(cart.values());
    }
    
    
    public void setShipPrice(int ship){
        this.ship = ship;
    }
    public int getShipPrice(){
        return ship;
    }
    public int getTotalShipPrice(){
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum = sum + lineItem.getTotalPrice();
        }
        return sum + ship;
    }
    public int getEco(){
        return 100;
    }
    public int getEms(){
        return 150;
    }
    public int getKerry(){
        return 200;
    }
}
