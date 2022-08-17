package com.example.springboot.repositories;

import com.example.springboot.models.JoinTable1;
import com.example.springboot.models.joinTable3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface JoinTable3Repository extends JpaRepository<joinTable3,Integer>{
    @Query(value = " select  z.zoom_name,m.movie_poster,m.movie_name,sc.schedule_start,sc.schedule_end,sc.schedule_id\n" +
            " from zoom z join seat s on s.zoom_id=z.zoom_id  join schedule sc on sc.zoom_id=z.zoom_id join movies m on m.movie_id=sc.movie_id\n" +
            " group by  z.zoom_name,m.movie_poster,m.movie_name,sc.schedule_start,sc.schedule_end,sc.schedule_id,sc.date_show\n" +
            " having  sc.date_show=?", nativeQuery = true)
    List<joinTable3> getShowScheduleMovie2(Date date);
}
