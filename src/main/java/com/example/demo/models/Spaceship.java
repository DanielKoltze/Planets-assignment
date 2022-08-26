package com.example.demo.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "Spaceship")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spaceship_id")
    private int id;
    @NotNull
    @Column(name = "spaceship_name")
    private String name;
    @NotNull
    @Column(name = "spaceship_speed")
    private double speed;
    @NotNull
    @Column(name = "number_of_seats")
    private int numberOfSeats;

    /*@OneToMany(mappedBy = "spaceship", cascade = CascadeType.ALL)
    private List<Reservation> reservations;*/


}
