package com.example.springboot.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
public class Zoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int zoomId;
    private String zoomName;
    @OneToMany(mappedBy = "zoom",fetch = FetchType.LAZY)
    private List<Seat> seat;
  public Zoom(){};
    @OneToMany(mappedBy = "zoom",fetch = FetchType.LAZY)
    private List<Schedule> schedules;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinemaId" , nullable = false)
    private Cinemas cinemas;

    public Zoom( String zoomName, List<Seat> seat, List<Schedule> schedules, Cinemas cinemas) {
        this.zoomName = zoomName;
        this.seat = seat;
        this.schedules = schedules;
        this.cinemas = cinemas;
    }

    public int getZoomId() {
        return zoomId;
    }

    public void setZoomId(int zoomId) {
        this.zoomId = zoomId;
    }

    public String getZoomName() {
        return zoomName;
    }

    public void setZoomName(String zoomName) {
        this.zoomName = zoomName;
    }
//
//    public List<Seat> getSeat() {
//        return seat;
//    }
//
//    public void setSeat(List<Seat> seat) {
//        this.seat = seat;
//    }

//    public List<Schedule> getSchedules() {
//        return schedules;
//    }
//
//    public void setSchedules(List<Schedule> schedules) {
//        this.schedules = schedules;
//    }
//
//    public Cinemas getCinemas() {
//        return cinemas;
//    }
//
//    public void setCinemas(Cinemas cinemas) {
//        this.cinemas = cinemas;
//    }

    @Override
    public String toString() {
        return "Zoom{" +
                "zoomId=" + zoomId +
                ", zoomName='" + zoomName + '\'' +
                '}';
    }
}
