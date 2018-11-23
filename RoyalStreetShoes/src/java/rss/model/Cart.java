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
import java.util.Objects;
import rss.jpa.model.Bestsell;
import rss.jpa.model.Product;

/**
 *
 * @author PONGTAWAN
 */
public class Cart implements Serializable{
    private Map<String,LineItem> cart;

    public Cart() {
        cart = new HashMap();
    }
    
    public void add(Product p){
        LineItem line = cart.get(p.getProductid());
        if(line == null){
            cart.put(p.getProductid(),new LineItem(p));
            System.out.println("add success");
        }else{
            line.setQuantity(line.getQuantity()+1);
            System.out.println("add yess");
        }
    }
    
    public void remove(Product p){
        this.remove(p.getProductid());
    }
    
    public void remove(String productCode){
        cart.remove(productCode);
    }
    
    public double getTotalPrice(){
        double sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum+=lineItem.getTotalPrice();
        }
        return sum;
    }
    
    public int getTotalQuantity(){
        int sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum+=lineItem.getQuantity();
        }
        return sum;
    }
  
    public List<LineItem>getLineItem(){
        return new ArrayList(cart.values());
    }
 
}
