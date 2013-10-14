package Nakumatt.Controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Nakumatt.Service.CategoriesService;
import Nakumatt.Service.ProductService;
import Nakumatt.dao.Categories;
import Nakumatt.dao.Products;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Clapton
 */
@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoriesService categoriesService;


    @RequestMapping(value = "prod.htm", method = RequestMethod.GET)
    public String showProductsPage(Map<String, Object> model) {
        Products products = new Products();
        model.put("products", products);
        Map<String, Object> ma = new LinkedHashMap<String, Object>();
        model.put("categoryList", categoriesService.findAll());
        List<Categories> l = categoriesService.findAll();
        System.out.println("Category size is : " + l.size());
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Category id :" + l.get(i).getCategoryId() + " Name is : " + l.get(i).getName());
        }

        return "products";
    }

    @RequestMapping(value = "prod.htm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute("products") Products products, BindingResult result) {

            System.out.println(" product names : "+products.getName()+" category");
            
            productService.save(products);
            return "success"; 

            
          

    }
     
}
