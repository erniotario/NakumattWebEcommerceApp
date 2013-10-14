package Nakumatt.dao;
// Generated Oct 10, 2013 1:47:08 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Carts generated by hbm2java
 */
public class Carts  implements java.io.Serializable {


     private Integer cartId;
     private Users users;
     private Products products;
     private Date date;
     private String quantity;
     private float price;
     private boolean active;
     private Set orderses = new HashSet(0);

    public Carts() {
    }

	
    public Carts(Users users, Products products, Date date, String quantity, float price, boolean active) {
        this.users = users;
        this.products = products;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.active = active;
    }
    public Carts(Users users, Products products, Date date, String quantity, float price, boolean active, Set orderses) {
       this.users = users;
       this.products = products;
       this.date = date;
       this.quantity = quantity;
       this.price = price;
       this.active = active;
       this.orderses = orderses;
    }
   
    public Integer getCartId() {
        return this.cartId;
    }
    
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }




}


