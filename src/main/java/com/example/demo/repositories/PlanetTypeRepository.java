package com.example.demo.repositories;

import com.example.demo.models.PlanetType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlanetTypeRepository extends JpaRepository<PlanetType, Integer> {
    PlanetType findById(int id);
}
