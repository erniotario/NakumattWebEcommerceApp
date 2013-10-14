package Nakumatt.dao;
// Generated Oct 10, 2013 1:47:08 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories  implements java.io.Serializable {


     private Integer categoryId;
     private String name;
     private String description;
     private boolean active;
     private Set productses = new HashSet(0);

    public Categories() {
    }

	
    public Categories(String name, String description, boolean active) {
        this.name = name;
        this.description = description;
        this.active = active;
    }
    public Categories(String name, String description, boolean active, Set productses) {
       this.name = name;
       this.description = description;
       this.active = active;
       this.productses = productses;
    }
   
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Set getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set productses) {
        this.productses = productses;
    }




}


