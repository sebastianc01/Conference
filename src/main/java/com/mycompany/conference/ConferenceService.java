/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conference;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sebastian
 */
@Service("conferenceService")
public class ConferenceService {
    
    @Autowired
    private ConferenceDAO conferenceDao;
    
 
    @Transactional
    public Conference getConference(long id) {
        return conferenceDao.getItem(id, Conference.class);
    }
 
    @Transactional
    public void addConference(Conference conference) {
        conferenceDao.addItem(conference);
    }
 
    @Transactional
    public void updateConference(Conference conference) {
        conferenceDao.updateItem(conference);
 
    }
 
    @Transactional
    public void deleteConference(long id) {
        conferenceDao.deleteItem(id, Conference.class);
    }
    
    @Transactional
    public List<Conference> getAllConferences() {
        return conferenceDao.getAll();
    }
}
