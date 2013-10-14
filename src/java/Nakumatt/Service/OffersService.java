/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Service;

import Nakumatt.dao.Products;
import java.util.List;

/**
 *
 * @author Eric
 */
public interface OffersService {

    public void increasePrice(int percentage);

    public List<Products> getProducts(int productId);
}
