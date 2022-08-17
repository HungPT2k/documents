package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class insertBooking1 {
    @Id
    private int scheduleId;
    private double price;
    private int status;
    private int seatId;
    private int userId;

}
