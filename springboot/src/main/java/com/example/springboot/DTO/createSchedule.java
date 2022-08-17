package com.example.springboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;
import java.sql.Time;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class createSchedule {

    private int zoomId;
    private int movieId;
    private Date dateShow;
    private Time scheduleStart;
    private Time scheduleEnd;

}
