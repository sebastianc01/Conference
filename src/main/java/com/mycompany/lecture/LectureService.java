/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sebastian
 */
@Service("lectureService")
public class LectureService {
    
    @Autowired
    private LectureDAO lectureDao;
    
 
    @Transactional
    public Lecture getLecture(long id) {
        return lectureDao.getItem(id, Lecture.class);
    }
 
    @Transactional
    public void addLecture(Lecture lecture) {
        lectureDao.addItem(lecture);
    }
 
    @Transactional
    public void updateLecture(Lecture lecture) {
        lectureDao.updateItem(lecture);
 
    }
 
    @Transactional
    public void deleteLecture(long id) {
        lectureDao.deleteItem(id, Lecture.class);
    }
    
    @Transactional
    public List<Lecture> getAllLectures() {
        return lectureDao.getAll();
    }
}
