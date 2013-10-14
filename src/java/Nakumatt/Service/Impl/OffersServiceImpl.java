/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Service.Impl;

import Nakumatt.Service.OffersService;
import Nakumatt.dao.Offers;
import Nakumatt.dao.Products;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Eric
 */
public class OffersServiceImpl implements OffersService {

    private SessionFactory sessionFactory;
    private Session session;
    private Object products;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        session = sessionFactory.openSession();
    }

    @Override
    public void increasePrice(int percentage) {
//      if (products != null) {
//            for (Offers offer : products) {
//                double offerPrice = offerPrice.getPrice().doubleValue() * 
//                                    (100 + percentage)/100;
//                product.setPrice(newPrice);
//            }
//        }   
        if(products!=null){
            
        }
    }

    @Override
    public List<Products> getProducts(int productId) {
        Products prod = (Products) session.get(Products.class, productId);
        return session.createCriteria(Offers.class).add(Restrictions.eq("products", prod)).list();
        

    }
}
