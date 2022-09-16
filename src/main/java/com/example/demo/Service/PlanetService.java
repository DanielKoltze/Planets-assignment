package com.example.demo.Service;

import com.example.demo.models.Planet;
import com.example.demo.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {

    PlanetRepository planetRepository;
    PlanetService(PlanetRepository planetRepository){
        this.planetRepository = planetRepository;
    }

    public Iterable<Planet> findAll(){
        return planetRepository.findAll();
    }

    public Optional<Planet> findById(int id){
        return planetRepository.findById(id);
    }
    public Optional<Planet> findByPlanetName(String name){
        return planetRepository.findByPlanetName(name);
    }
}
