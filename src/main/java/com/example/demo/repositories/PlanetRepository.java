package com.example.demo.repositories;

import com.example.demo.models.Planet;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PlanetRepository extends CrudRepository<Planet,Integer> {

    Optional<Planet> findById(int integer);


    //eksempel på custom query
    @Query("SELECT planet FROM Planet planet WHERE planet.name = ?1")
    Optional<Planet> findByPlanetName(String name);
}
