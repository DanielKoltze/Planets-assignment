package com.example.demo.repositories;

import com.example.demo.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface PlanetRepository extends CrudRepository<Planet,Integer> {
    Planet findPlanetById(int id);
    ArrayList<Planet> findByMass(double mass);
}
