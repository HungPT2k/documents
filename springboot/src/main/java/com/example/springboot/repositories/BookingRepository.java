package com.example.springboot.repositories;

import com.example.springboot.DTO.insertBooking;
import com.example.springboot.models.Booking;
import com.example.springboot.models.historyBooking;
import com.example.springboot.models.insertBooking1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookingRepository extends JpaRepository<insertBooking1,Integer> {
    @Modifying
    @Transactional
    @Query(value = "insert into booking(price,status,schedule_id,seat_id,user_id)\n" +
            "values(?,?,?,?,?)",nativeQuery = true)
    int insertBooking(double p, int s, int sc, int se, int u);

    @Query(value = "select * from booking",nativeQuery = true)
    List<insertBooking1> findAllBooking();

}
