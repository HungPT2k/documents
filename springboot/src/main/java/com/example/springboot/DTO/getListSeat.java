package com.example.springboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class getListSeat {
    private int seatId;
    private    String zoomName;
    private int numberSeat;
}
