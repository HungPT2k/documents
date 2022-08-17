package com.example.springboot.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class joinTable3 {
    @Id
    private int scheduleId;
    private String zoomName;
    private String movieName;
    private String moviePoster;
    private Time scheduleStart;
    private Time scheduleEnd;


    }

