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
public class historyBooking {
    @Id
    private int bookingId;
    private int userId;
    private String zoomName;
    private String movieName;
    private String moviePoster;
    private Time scheduleStart;
    private Time scheduleEnd;
    private Date dateShow;
    private int numberSeat;
    private float price;
}
