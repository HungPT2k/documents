package com.example.springboot.models;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data

@AllArgsConstructor
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    private String movieName;
    private String movieTrailer;
    private String moviePoster;
    private String movieType;
    private String movieDetail;
    private Date dateRelease;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "movies")
    private List<Schedule> scheduleList;
    public Movies(){}
    public Movies(String movieName, String movieTrailer, String moviePoster, String movieType, String movieDetail, Date dateRelease, List<Schedule> scheduleList) {
        this.movieName = movieName;
        this.movieTrailer = movieTrailer;
        this.moviePoster = moviePoster;
        this.movieType = movieType;
        this.movieDetail = movieDetail;
        this.dateRelease = dateRelease;
        this.scheduleList = scheduleList;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieTrailer() {
        return movieTrailer;
    }

    public void setMovieTrailer(String movieTrailer) {
        this.movieTrailer = movieTrailer;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMovieDetail() {
        return movieDetail;
    }

    public void setMovieDetail(String movieDetail) {
        this.movieDetail = movieDetail;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieTrailer='" + movieTrailer + '\'' +
                ", moviePoster='" + moviePoster + '\'' +
                ", dateRelease='" + dateRelease + '\'' +
                '}';
    }
}
