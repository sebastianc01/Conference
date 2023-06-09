/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

import com.mycompany.dao.DAO;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Sebastian
 */
public class UserDAO extends DAO<User> {
    
    public List<User> getAll() {
        Session session = super.getSessionFactory().getCurrentSession();
        List<User> users = session.createQuery("from User").list();
        return users;
    }
}
