package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieId",nullable = false)
    private Movies movies;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zoomId",nullable = false)
    private Zoom zoom;
    private Date dateShow;
    private Time scheduleStart;
    private Time scheduleEnd;


    public String getZoom() {
        return zoom.getZoomName();
    }

    public void setZoom(Zoom zoom) {
        this.zoom = zoom;
    }
    public String getMovies() {
        return movies.getMovieName();
    }
    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public Date getDateShow() {
        return dateShow;
    }

    public void setDateShow(Date dateShow) {
        this.dateShow = dateShow;
    }

    public Time getScheduleStart() {
        return scheduleStart;
    }

    public void setScheduleStart(Time scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public Time getScheduleEnd() {
        return scheduleEnd;
    }

    public void setScheduleEnd(Time scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", movies=" + movies +
                ", zoom=" + zoom +
                ", dateShow='" + dateShow + '\'' +
                ", scheduleStart='" + scheduleStart + '\'' +
                ", scheduleEnd='" + scheduleEnd + '\'' +
                '}';
    }
}
