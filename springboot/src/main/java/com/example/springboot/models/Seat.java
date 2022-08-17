package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zoomId" , nullable = false)
    private Zoom zoom;
    @OneToOne (mappedBy = "seat",fetch = FetchType.LAZY)
    private Booking booking;
    private int numberSeat;
    public Seat(){}

    public Seat(Zoom zoom, int numberSeat) {
        this.zoom = zoom;
        this.numberSeat = numberSeat;
    }

    public Zoom getZoom() {
        return zoom;
    }

    public void setZoom(Zoom zoom) {
        this.zoom = zoom;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatId=" + seatId +
                ", zoom=" + zoom +
                ", numberSeat=" + numberSeat +
                '}';
    }
}
