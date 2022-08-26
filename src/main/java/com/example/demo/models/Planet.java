package com.example.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Planet {
    //At det er id altså primary type
    @Id
    //at id bliver autoincromented tror jeg
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @ManyToMany(mappedBy = "planets")
    private Set<PlanetType> planetTypeSet = new HashSet<>();

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
