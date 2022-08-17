package com.example.springboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class getShowSchedule {
    private int scheduleId;
    private String zoomName;
    private String movieName;
    private String moviePoster;
    private Time scheduleStart;
    private Time scheduleEnd;
}
