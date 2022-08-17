package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="userId",nullable = false )
    private Users user;                     // private int idUser;
    @OneToOne (cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "seatId")
    private Seat seat;                      // private int seatId;
    @OneToOne (cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "scheduleId")
    private Schedule schedule;              // private int idSchedule;
    private float price;
    private boolean status;


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
