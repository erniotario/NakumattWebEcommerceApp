/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Controller;

import Nakumatt.Service.CategoriesService;
import Nakumatt.dao.Categories;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Clapton
 */
@Controller
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;
    
    
//    public void setCategoriesService(CategoriesService categoriesService) {
//        this.categoriesService = categoriesService;
//    }

    @RequestMapping(value="/cat.htm",method = RequestMethod.GET)
    public String showCategoriesPage(Map<String,Object>model,@ModelAttribute("categories")Categories categories) {
//        Categories categories = new Categories();
//        model.addAttribute("categories", categories);
        return "categories";
    }
     /**
     *
     * @param categories
     * @param result
     * @return
     */
    private List<Categories> categoriesList = new ArrayList<Categories>();
	 
	        @RequestMapping(value="/categories.htm",method=RequestMethod.GET)
	        public String showForm(){
                return "categories";
       }
    @RequestMapping(value="/cat.htm",method = RequestMethod.POST)
    public String processForm(@ModelAttribute("categories") Categories categories, BindingResult result) {
        if (result.hasErrors()) {
            return "categories";
        } else {
            categoriesService.save(categories);
            return "success";
        }
    }
}
