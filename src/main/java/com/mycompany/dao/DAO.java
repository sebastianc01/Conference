/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Universal DAO with basic operations.
 * @author Sebastian
 * @param <T> 
 */

@Repository
public class DAO<T> {
    
    @Setter
    @Getter
    @Autowired
    private SessionFactory sessionFactory;
    
//    public List getAllCountries() {
//        Session session = this.sessionFactory.getCurrentSession();
//        List countryList = session.createQuery("from Country").list();
//        return countryList;
//    }
 
    public T getItem(long id, Class<T> type) {
        Session session = this.sessionFactory.getCurrentSession();
        T item = (T) session.load(type, id);
        return item;
    }
 
    public T addItem(T item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(item);
        return item;
    }
 
    public void updateCountry(T item) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(item);
    }
 
    public void deleteCountry(long id, Class<T> type) {
        Session session = this.sessionFactory.getCurrentSession();
        T item = (T) session.load(type,id);
        if (null != item) {
            session.delete(item);
        }
    }
    
}
