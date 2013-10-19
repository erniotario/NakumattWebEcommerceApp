package Nakumatt.Service.Impl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Nakumatt.Service.ProductService;
import Nakumatt.dao.Categories;
import Nakumatt.dao.Products;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Clapton
 */
public class ProductServiceImpl implements ProductService {

    private SessionFactory sessionFactory;
    private Session session;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        session = sessionFactory.openSession();
    }

    @Override
    public void save(Products products) {
        try {
            session.beginTransaction();
            System.out.println(" product name  service: "+products.getName());
            session.saveOrUpdate(products);
            session.getTransaction().commit();


        } catch (Exception ex) {
            session.getTransaction().rollback();
        }
    }

    @Override
    public Products findById(int productId) {
       return (Products) session.get(Products.class, productId);
    }

    @Override
    public List<Products> findByCategory(int categoryId) {
        Categories cat = (Categories) session.get(Categories.class, categoryId);
        return session.createCriteria(Products.class).add(Restrictions.eq("categories", cat)).list();
    }

    @Override
    public List<Products> findAll() {
        
        
        return session.createCriteria(Products.class).list();
    }

}
