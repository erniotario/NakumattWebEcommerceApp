/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Service.Impl;

import Nakumatt.Service.CategoriesService;
import Nakumatt.dao.Categories;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Clapton
 */
public class CategoriesServiceImpl implements CategoriesService {

    private SessionFactory sessionFactory;
    private Session session;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        session = sessionFactory.openSession();
    }

    @Override
    public void save(Categories categories) {
        try {
            session.beginTransaction();
            session.saveOrUpdate(categories);
            session.getTransaction().commit();


        } catch (Exception ex) {
            session.getTransaction().rollback();
        }
    }

    @Override
    public Categories findById(int CategoryId) {
       return (Categories) session.get(Categories.class,CategoryId);
    }

    @Override
    public List<Categories> findAll() {
        session.beginTransaction();
        List<Categories>cat= session.createCriteria(Categories.class).list();
        session.getTransaction().commit();
        return cat;
        
    }
}
