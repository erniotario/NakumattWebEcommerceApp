package Nakumatt.dao;
// Generated Oct 16, 2013 2:10:04 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Shipper generated by hbm2java
 */
public class Shipper  implements java.io.Serializable {


     private Integer shipperId;
     private String name;
     private String phone;
     private Set orderses = new HashSet(0);

    public Shipper() {
    }

	
    public Shipper(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Shipper(String name, String phone, Set orderses) {
       this.name = name;
       this.phone = phone;
       this.orderses = orderses;
    }
   
    public Integer getShipperId() {
        return this.shipperId;
    }
    
    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }




}


