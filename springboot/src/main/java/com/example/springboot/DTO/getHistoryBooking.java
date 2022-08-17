package com.example.springboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class getHistoryBooking {
    private String zoomName;
    private String movieName;
    private String moviePoster;
    private Time scheduleStart;
    private Time scheduleEnd;
    private Date dateShow;
    private int numberSeat;
    private float price;
}
