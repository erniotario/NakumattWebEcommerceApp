/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Converter;

import Nakumatt.dao.Categories;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Clapton
 */
@Component
public class ItemConverter implements Converter< Categories, String> {

    @Override
    public String convert(Categories s) {

         System.out.println("category id ismv : ");
        Integer id = s.getCategoryId();
       
        return id != null ? id.toString() : "";

    }
}
