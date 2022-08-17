package com.example.springboot.repositories;

import com.example.springboot.models.historyBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface joinTable4Repository extends JpaRepository<historyBooking,Integer> {
    @Query(value = " select  b.booking_id,u.user_id,z.zoom_name,m.movie_poster,m.movie_name,sc.schedule_start,sc.schedule_end,sc.date_show,s.number_seat,b.price\n" +
            " from users u join booking b on u.user_id=b.user_id   join schedule sc on sc.schedule_id=b.schedule_id join seat s on b.seat_id=s.seat_id join zoom z on z.zoom_id=sc.zoom_id join movies m on m.movie_id=sc.movie_id\n" +
            " group by  b.booking_id,  u.user_id,z.zoom_name,m.movie_poster,m.movie_name,sc.schedule_start,sc.schedule_end,sc.date_show,s.number_seat,b.price\n" +
            " having  u.user_id=?",nativeQuery = true)
    List<historyBooking> getBookingByIdUser(int id);
}
