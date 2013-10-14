package Nakumatt.Service;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Nakumatt.dao.Products;
import java.util.List;

/**
 *
 * @author Clapton
 */
public interface ProductService {

    public void save(Products products);

    public Products findById(int productId);

    public List<Products> findByCategory(int categoryId);

    public List<Products> findAll();
}
