package com.example.springboot.serviceiml;

import com.example.springboot.DTO.getHistoryBooking;
import com.example.springboot.DTO.insertBooking;
import com.example.springboot.models.*;
import com.example.springboot.repositories.BookingRepository;
import com.example.springboot.repositories.joinTable4Repository;
import com.example.springboot.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingIml implements BookingService {
    @Autowired
    private BookingRepository repository;
    @Autowired
    private joinTable4Repository  table4Repository;

    @Override
    public Boolean CheckSeatBooking(int idSc, int idS) {
        List<insertBooking1> listB=repository.findAllBooking();
        for (insertBooking1 b:listB){
            if(idSc==b.getScheduleId() && idS==b.getSeatId())
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public ResponseObject1 insertBooking(double p, int s, int sc, int se, int u) {
     boolean check=  CheckSeatBooking(sc,se);
     if(check)
     {
         return new ResponseObject1("Fail", "Seat is already",0);
     }
     else {
         return new ResponseObject1("successful", "booking successful", repository.insertBooking(p,s,sc,se,u));
     }
    }

    @Override
    public List<insertBooking1> getAllBooking() {
        return repository.findAllBooking();
    }

    @Override
    public List<getHistoryBooking> showAllBookingUser(int id) {
        List<getHistoryBooking> listHistory= new ArrayList<>();
        for(historyBooking h:table4Repository.getBookingByIdUser(id) ){
            listHistory.add(new getHistoryBooking(h.getZoomName(),h.getMovieName(),h.getMoviePoster(),h.getScheduleStart(),h.getScheduleEnd(),h.getDateShow(),h.getNumberSeat(),h.getPrice()));
        }
        return listHistory;
    }
}
