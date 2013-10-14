/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Service;

import Nakumatt.dao.Categories;
import java.util.List;

/**
 *
 * @author Clapton
 */
public interface CategoriesService {
     public abstract void save(Categories categories);

    public abstract Categories findById(int CategoryId);

    public abstract List<Categories> findAll();
    
}
