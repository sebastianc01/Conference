package com.mycompany.user;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.mycompany.lecture.Lecture;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Sebastian
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String email;
    private String login;
    
    @ManyToMany
    private List<Lecture> lectures = new ArrayList<Lecture>();
    
    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }
}
