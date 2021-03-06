package Nakumatt.dao;
// Generated Oct 16, 2013 2:10:04 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Offers generated by hbm2java
 */
public class Offers  implements java.io.Serializable {


     private Integer offerId;
     private Products products;
     private float offerPrice;
     private String description;
     private Date offerSartingDate;
     private Date offerEndingDate;
     private boolean active;

    public Offers() {
    }

    public Offers(Products products, float offerPrice, String description, Date offerSartingDate, Date offerEndingDate, boolean active) {
       this.products = products;
       this.offerPrice = offerPrice;
       this.description = description;
       this.offerSartingDate = offerSartingDate;
       this.offerEndingDate = offerEndingDate;
       this.active = active;
    }
   
    public Integer getOfferId() {
        return this.offerId;
    }
    
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }
    public float getOfferPrice() {
        return this.offerPrice;
    }
    
    public void setOfferPrice(float offerPrice) {
        this.offerPrice = offerPrice;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getOfferSartingDate() {
        return this.offerSartingDate;
    }
    
    public void setOfferSartingDate(Date offerSartingDate) {
        this.offerSartingDate = offerSartingDate;
    }
    public Date getOfferEndingDate() {
        return this.offerEndingDate;
    }
    
    public void setOfferEndingDate(Date offerEndingDate) {
        this.offerEndingDate = offerEndingDate;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }




}


