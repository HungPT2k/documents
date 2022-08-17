package com.example.springboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class insertBooking {
    private double price;
    private int status;
    private int scheduleId;
    private int seatId;
    private int userId;
}
