/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.model;

import rss.jpa.model.Product;

/**
 *
 * @author PONGTAWAN
 */
public class LineItem {
    private Product product;
    private int salePrice;
    private int quantity;

    public LineItem() {
    }

    public LineItem(Product product) {
        this.product = product;
    }

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.salePrice = product.getProductprice();
    }
    
    public int getTotalPrice() {
        return this.quantity * this.salePrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
    
}
