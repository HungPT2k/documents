package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class createSchedule1 {
    @Id
    private int scheduleId;
    private int zoomId;
    private int movieId;
    private Date dateShow;
    private Time scheduleStart;
    private Time scheduleEnd;

}
