package com.example.springboot.repositories;

import com.example.springboot.models.JoinTable1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JoinTable1Repository extends JpaRepository<JoinTable1,Integer>{
    @Query(value = "select  m.movie_name ,z.zoom_name,sc.schedule_id" +
                    " from zoom z join seat s on s.zoom_id=z.zoom_id  join schedule sc on sc.zoom_id=z.zoom_id join movies m on m.movie_id=sc.movie_id" +
                    " group by m.movie_name,z.zoom_name,sc.schedule_id", nativeQuery = true)
    List<JoinTable1> getShowScheduleMovie();
}
