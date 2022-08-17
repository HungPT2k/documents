package com.example.springboot.controllers;

import com.example.springboot.DTO.getHistoryBooking;
import com.example.springboot.DTO.insertBooking;
import com.example.springboot.models.*;
import com.example.springboot.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping(path = "/ap1/v1/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/allBooking")
    List<insertBooking1> getAllBooking() {
        return bookingService.getAllBooking();
    }
    @GetMapping("insert/{price}/{status}/{scheduleId}/{seatId}/{userId}")
    ResponseEntity<ResponseObject1> InsertMovie(@PathVariable("price") double price, @PathVariable("status") int status, @PathVariable("scheduleId") int scheduleId, @PathVariable("seatId") int seatId, @PathVariable("userId") int userId ) {

        return  ResponseEntity.status(HttpStatus.OK).body( bookingService.insertBooking(price,status,scheduleId,seatId,userId));
    }
    @GetMapping("/historyBooking/{id}")
    List<getHistoryBooking> getAllHistoryBookingByUserId(@PathVariable ("id") int id){
        return bookingService.showAllBookingUser(id);
    }
}
