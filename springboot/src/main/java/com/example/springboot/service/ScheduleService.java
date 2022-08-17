package com.example.springboot.service;

import com.example.springboot.DTO.createSchedule;
import com.example.springboot.DTO.getListMovie;
import com.example.springboot.DTO.getListSeat;
import com.example.springboot.DTO.getShowSchedule;
import com.example.springboot.models.ResponseObject;
import com.example.springboot.models.ResponseObject1;
import com.example.springboot.models.Schedule;
import com.example.springboot.models.createSchedule1;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface ScheduleService {

   List<getShowSchedule> ShowScheduleMovie(Date date);
   List<getListMovie> ListMovieByZoom();
    List<getListSeat> ListSeatOfZoom(String name);
    ResponseObject1 addNewSchedule(Date date, Time time2, Time time1, int idm, int idz);
    List<Schedule> getAllSchedule();
    List<createSchedule1> getAllScheduleBySql();
    Boolean checkSchedule(Date date,Time time2, Time time1,int idz);
     ResponseObject deleteScheduleById(int id) ;
}
