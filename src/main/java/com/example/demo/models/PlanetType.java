package com.example.demo.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Planet_type")
public class PlanetType {
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "planet_type_id")
    private int id;

    @NotNull
    @Column(name = "planet_type_type")
    private String planetType;


    @ManyToMany(mappedBy = "planets")
    private List<Planet> planets;

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
