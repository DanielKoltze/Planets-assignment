package com.example.demo.repositories;

import com.example.demo.models.Planet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PlanetRepository extends CrudRepository<Planet,Integer> {

    Optional<Planet> findById(int integer);

}
