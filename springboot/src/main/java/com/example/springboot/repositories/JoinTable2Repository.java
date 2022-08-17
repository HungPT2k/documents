package com.example.springboot.repositories;

import com.example.springboot.models.JoinTable2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JoinTable2Repository extends JpaRepository<JoinTable2,Integer> {
    @Query(value = " select  z.zoom_name,s.number_seat,s.seat_id\n" +
            " from zoom z join seat s on s.zoom_id=z.zoom_id  \n" +
            " group by  z.zoom_name,s.number_seat,s.seat_id\n" +
            " having  z.zoom_name=?", nativeQuery = true)
    List<JoinTable2> getShowSeatNumberOfRoom(String name);

}
