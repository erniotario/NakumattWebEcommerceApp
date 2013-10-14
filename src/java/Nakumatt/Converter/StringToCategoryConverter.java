/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Converter;

import Nakumatt.Service.CategoriesService;
import Nakumatt.dao.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Eric
 */
@Component
public class StringToCategoryConverter implements Converter<String, Categories> {

    @Autowired
    private CategoriesService categoriesService;

    @Override
    public Categories convert(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Categories cat = categoriesService.findById(Integer.valueOf(s));
        System.out.println("converted :"+cat);
        return cat;
    }
}
