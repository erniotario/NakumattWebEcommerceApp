/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Controller;

import Nakumatt.Service.UsersService;
import Nakumatt.dao.Users;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Clapton
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    


    @RequestMapping(value="/us.htm",method = RequestMethod.GET)
    public String showUsersPage(Map<String,Object>model,@ModelAttribute("users")Users users) {

        return "users";
    }
     /**
     *
     * @param users
     * @param result
     * @return
     */
    private List<Users> usersList = new ArrayList<Users>();
	 
	        @RequestMapping(value="/users.htm",method=RequestMethod.GET)
	        public String showForm(){
                return "users";
       }
    @RequestMapping(value="/us.htm",method = RequestMethod.POST)
    public String processForm(@ModelAttribute("users") Users users, BindingResult result) {
        if (result.hasErrors()) {
            return "users";
        } else {
            usersService.save(users);
            return "success";
        }
    }
}
