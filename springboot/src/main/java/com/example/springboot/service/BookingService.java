package com.example.springboot.service;

import com.example.springboot.DTO.getHistoryBooking;
import com.example.springboot.DTO.insertBooking;
import com.example.springboot.models.*;

import java.util.List;

public interface BookingService {
    Boolean CheckSeatBooking(int idSc, int idS);
    ResponseObject1 insertBooking(double p, int s, int sc, int se, int u);
    List<insertBooking1> getAllBooking();
    List<getHistoryBooking> showAllBookingUser(int id);
}
