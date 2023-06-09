/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conference;

import com.mycompany.dao.DAO;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Sebastian
 */
public class ConferenceDAO extends DAO<Conference> {
    
    public List<Conference> getAll() {
        Session session = super.getSessionFactory().getCurrentSession();
        List<Conference> conferences = session.createQuery("from Conference").list();
        return conferences;
    }
}
