package com.example.springboot.serviceiml;

import com.example.springboot.DTO.createSchedule;
import com.example.springboot.DTO.getListMovie;
import com.example.springboot.DTO.getListSeat;
import com.example.springboot.DTO.getShowSchedule;
import com.example.springboot.models.*;
import com.example.springboot.repositories.*;
import com.example.springboot.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ScheduleIml implements ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;
   @Autowired
   private JoinTable1Repository joinTable1Repository;
    @Autowired
    private JoinTable2Repository joinTable2Repository;
    @Autowired
    private JoinTable3Repository joinTable3Repository;
    @Autowired
    private createScheduleRepository createScheduleRepository;


    @Override
    public List<getShowSchedule> ShowScheduleMovie(Date date) {
        List<getShowSchedule> listSc=new ArrayList<>();
        for( joinTable3 i: joinTable3Repository.getShowScheduleMovie2(date))
        {
            listSc.add(new getShowSchedule(i.getScheduleId(),i.getZoomName(),i.getMovieName(),i.getMoviePoster(),i.getScheduleStart(),i.getScheduleEnd()));
        }
        return listSc;
    }

    @Override
    public List<getListMovie> ListMovieByZoom() {
        List<getListMovie> listMbZ=new ArrayList<>();
        Set<String> setZ=new HashSet<>();
        String s="";
        for(JoinTable1 i: joinTable1Repository.getShowScheduleMovie()){
            s=i.getZoomName();
            setZ.add(s);
        }

        for(String j:setZ){
            String s1="";
            String s2="";
        for(JoinTable1 i: joinTable1Repository.getShowScheduleMovie()) {
            if(j.equals(i.getZoomName())){
          //  s2= i.getMovieName();
            s1= (i.getMovieName()+ ",");
            s2+=s1;}
        }
        listMbZ.add(new getListMovie(j,s2));
        }
        return listMbZ;
    }

    @Override
    public List<getListSeat> ListSeatOfZoom(String name) {
        List<getListSeat> listSoZ=new ArrayList<>();
        Set<String> setS=new HashSet<>();
        String s="";
        for(JoinTable2 i: joinTable2Repository.getShowSeatNumberOfRoom(name)){
            listSoZ.add(new getListSeat(i.getSeatId(),i.getZoomName(),i.getNumberSeat()));
        }
        return listSoZ;
    }

    @Override
    public ResponseObject1 addNewSchedule(Date date, Time time2, Time time1, int idm, int idz) {
        boolean check = checkSchedule(date,time2,time1,idz);
            if(check){
                return new ResponseObject1("Fail", "Schedule is already",0);
            }
            else {
                return new ResponseObject1("Successful", "Create Schedule successful", createScheduleRepository.addNewSchedule(date,time2,time1,idm,idz));
            }


    }


    @Override
    public List<Schedule> getAllSchedule() {
        return scheduleRepository.findAll();
    }

    @Override
    public List<createSchedule1> getAllScheduleBySql() {
        return createScheduleRepository.getAllScheduleBySql();
    }

    @Override
    public Boolean checkSchedule(Date date, Time time2, Time time1, int idz) {
        for( createSchedule1 c:createScheduleRepository.getAllScheduleBySql()){
            if(date.compareTo(c.getDateShow())==0 && idz==(c.getZoomId())){
             long  t1=time1.getTime();
                long  t2=time2.getTime();
                long  tc1=c.getScheduleStart().getTime();
                long  tc2=c.getScheduleEnd().getTime();
                if((tc1>=t1 && tc1<=t2) || (tc2>=t1 && tc2<=t2) || (t1>=tc1 && t1<=tc2) || (t2>=tc1 && t2<=tc2) ){
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public ResponseObject deleteScheduleById(int id) {
        for (createSchedule1 c : createScheduleRepository.getAllScheduleBySql()) {
            if (c.getScheduleId() == id) {
                createScheduleRepository.deleteScheduleById(id);
                return new ResponseObject("Ok", "Schedule is  deleted", "");
            }}
            return new ResponseObject("Fail", "Schedule is  not already", "");
        }



}
