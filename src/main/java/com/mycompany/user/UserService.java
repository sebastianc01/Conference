/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sebastian
 */
@Service("userService")
public class UserService {
    
    @Autowired
    private UserDAO userDao;
    
 
    @Transactional
    public User getUser(long id) {
        return userDao.getItem(id, User.class);
    }
 
    @Transactional
    public void addUser(User user) {
        userDao.addItem(user);
    }
 
    @Transactional
    public void updateUser(User user) {
        userDao.updateItem(user);
 
    }
 
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteItem(id, User.class);
    }
    
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAll();
    }
}

