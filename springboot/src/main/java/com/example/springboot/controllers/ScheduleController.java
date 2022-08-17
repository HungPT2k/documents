package com.example.springboot.controllers;

import com.example.springboot.DTO.getListMovie;
import com.example.springboot.DTO.getListSeat;
import com.example.springboot.DTO.getShowSchedule;
import com.example.springboot.models.ResponseObject;
import com.example.springboot.models.ResponseObject1;
import com.example.springboot.models.Schedule;
import com.example.springboot.models.createSchedule1;
import com.example.springboot.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping(path = "/ap1/v1/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    @GetMapping("/all1")
    List<Schedule> getAll1(){
        return scheduleService.getAllSchedule();
    }
    @GetMapping("/all2")
    List<createSchedule1> getAll2(){return scheduleService.getAllScheduleBySql();}
    @GetMapping("/movieOfZoom")
    List<getListMovie> getListMovies() {
        return scheduleService.ListMovieByZoom();
    }
    @GetMapping("/seatOfZoom/{name}")
    List<getListSeat> getListSeats(@PathVariable("name") String name) {
        return scheduleService.ListSeatOfZoom(name);
    }
    @GetMapping("/show/{date}")
    List<getShowSchedule> getShow(@PathVariable("date") Date date){
        return scheduleService.ShowScheduleMovie(date);
    }
    @GetMapping("/addNew/{date}/{etime}/{stime}/{idm}/{idz}")
    ResponseEntity<ResponseObject1> addNewSchedule(@PathVariable Date date, @PathVariable Time etime, @PathVariable Time stime, @PathVariable int idm, @PathVariable int idz) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.addNewSchedule(date,etime,stime,idm,idz));
    }
    @GetMapping("/delete/{id}")
    ResponseEntity<ResponseObject> deleteSchedule(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.deleteScheduleById(id));
    }
}
