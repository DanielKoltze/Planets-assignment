package com.example.demo.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int id;
    /*@NotNull
    @Column(name = "reservation_customer")
    private List<Customer> customers;*/
    /*@NotNull
    @Column(name = "reservation_planet")
    private Planet planet;*/
    @NotNull
    @Column(name = "reservation_time_frame")
    private int timeFrame;

    public Reservation(int timeFrame, Spaceship spaceship) {
        this.timeFrame = timeFrame;
        this.spaceship = spaceship;
    }

    @ManyToOne
    private Spaceship spaceship;

    public Reservation() {

    }
}
