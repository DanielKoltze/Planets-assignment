package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Planet")
public class Planet {
    //At det er id altså primary type
    @Id
    //at id bliver autoincromented tror jeg
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //behøves ikke men bruges til at give et navn (tror jeg)
    @Column(name = "planet_id")
    private int id;
    @NotNull
    @Column(name = "planet_name")
    private String name;
    @NotNull
    @Column(name = "planet_mass")
    private double mass;
    @NotNull
    @Column(name = "planet_diameter")
    private double diameter;
    //json managed refernece er den der er main
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "planet_type_planet",
            joinColumns = @JoinColumn(name = "planet_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_type_id"))
    private List<PlanetType> planets;

    public Planet(int id, String name, double mass, double diameter) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    public Planet(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }
    public Planet(String name, double mass, double diameter, List<PlanetType> planets) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.planets = planets;
    }

    public Planet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public int getId() {
        return id;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mass=" + mass +
                ", diameter=" + diameter +
                '}';
    }

}
