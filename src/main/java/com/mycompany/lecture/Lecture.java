/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Lecture implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String startHour;
    private String endHour;
    private int currentParticipants;
    private int totalParticipants;

    public Lecture(String name, String startHour, String endHour, int totalParticipants) {
        this.name = name;
        this.startHour = startHour;
        this.endHour = endHour;
        this.totalParticipants = totalParticipants;
        this.currentParticipants = 0;
    }
}
