package com.example.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class PlanetType {
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "planet_type_id")
    private int id;
    @NotNull
    @Column(name = "planet_type_type")
    private String planetType;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "planet_type_planet",
            joinColumns = @JoinColumn(name = "planet_type_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id"))
    private List<Planet> planets = new ArrayList<>();

    public PlanetType() {

    }

    public int getId() {
        return id;
    }

    public String getPlanetType() {
        return planetType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlanetType(String planetType) {
        this.planetType = planetType;
    }

    public PlanetType(int id, String planetType) {
        this.id = id;
        this.planetType = planetType;
    }

    public PlanetType(String planetType) {
        this.planetType = planetType;
    }

    @Override
    public String toString() {
        return "PlanetType{" +
                "id=" + id +
                ", planetType='" + planetType + '\'' +
                '}';
    }
}
