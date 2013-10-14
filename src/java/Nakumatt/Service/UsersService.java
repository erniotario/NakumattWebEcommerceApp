/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nakumatt.Service;

import Nakumatt.dao.Users;
import java.util.List;

/**
 *
 * @author Clapton
 */
public interface UsersService {
     public abstract void save(Users users);

    public abstract Users findById(int usersId);

    public abstract List<Users> findAll();
    
}
