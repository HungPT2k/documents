package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinTable1 {
    @Id
    private int scheduleId;
    private String movieName;
    private String zoomName;
 //   private String numberSeat;
}
