/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture;

import com.mycompany.dao.DAO;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Sebastian
 */
public class LectureDAO extends DAO<Lecture> {
    
    public List<Lecture> getAll() {
        Session session = super.getSessionFactory().getCurrentSession();
        List<Lecture> lectures = session.createQuery("from Lecture").list();
        return lectures;
    }
}
