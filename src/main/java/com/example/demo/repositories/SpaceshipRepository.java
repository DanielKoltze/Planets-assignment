package com.example.demo.repositories;

import com.example.demo.models.Spaceship;
import org.springframework.data.repository.CrudRepository;

public interface SpaceshipRepository extends CrudRepository<Spaceship, Integer> {
}
