package com.example.springboot.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JoinTable2 {
    @Id
    private int seatId;
    private String zoomName;

    private int numberSeat;


}
