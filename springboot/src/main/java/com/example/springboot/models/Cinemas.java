package com.example.springboot.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinemas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cinemaId;
    private String cinemaName;
    private String cinemaAdress;
    @OneToMany(mappedBy = "cinemas",fetch = FetchType.LAZY)
    List<Zoom> zoomList;
//
//    public int getCinemaId() {
//        return cinemaId;
//    }
//
//    public void setCinemaId(int cinemaId) {
//        this.cinemaId = cinemaId;
//    }
//
//    public String getCinemaName() {
//        return cinemaName;
//    }
//
//    public void setCinemaName(String cinemaName) {
//        this.cinemaName = cinemaName;
//    }
//
//    public String getCinemaAdress() {
//        return cinemaAdress;
//    }
//
//    public void setCinemaAdress(String cinemaAdress) {
//        this.cinemaAdress = cinemaAdress;
//    }

    @Override
    public String toString() {
        return "Cinemas{" +
                "cinemaId=" + cinemaId +
                ", cinemaName='" + cinemaName + '\'' +
                ", cinemaAdress='" + cinemaAdress + '\'' +
                '}';
    }
}
