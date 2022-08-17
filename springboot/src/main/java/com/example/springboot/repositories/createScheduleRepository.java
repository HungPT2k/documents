package com.example.springboot.repositories;

import com.example.springboot.DTO.createSchedule;
import com.example.springboot.models.createSchedule1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface createScheduleRepository extends JpaRepository<createSchedule1,Integer> {
    @Modifying
    @Transactional
    @Query(value = "insert into schedule(date_show,schedule_end,schedule_start,movie_id,zoom_id)\n" +
            "values (?,?,?,?,?)",nativeQuery = true)
    int addNewSchedule(Date date, Time time2,Time time1,int idm, int idz);

    @Query(value = "select * from schedule",nativeQuery = true)
    List<createSchedule1> getAllScheduleBySql();

    @Modifying
    @Transactional
    @Query(value = "delete from schedule where schedule_id=?",nativeQuery = true)
    void deleteScheduleById(int id);
}

