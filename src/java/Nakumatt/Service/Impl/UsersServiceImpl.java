/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Service.Impl;

import Nakumatt.Service.UsersService;
import Nakumatt.dao.Users;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Clapton
 */
public class UsersServiceImpl implements UsersService {

    private SessionFactory sessionFactory;
    private Session session;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        session = sessionFactory.openSession();
    }

    @Override
    public void save(Users users) {
       try {
            session.beginTransaction();
            session.saveOrUpdate(users);
            session.getTransaction().commit();


        } catch (Exception ex) {
            session.getTransaction().rollback();
        }
    }

    @Override
    public Users findById(int usersId) {
        return (Users) session.get(Users.class,usersId);
    }

    @Override
    public List<Users> findAll() {
        session.beginTransaction();
        List<Users>us= session.createCriteria(Users.class).list();
        session.getTransaction().commit();
        return us;
    }
}
