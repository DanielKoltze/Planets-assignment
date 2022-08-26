package com.example.demo;

import com.example.demo.models.Planet;
import com.example.demo.models.PlanetType;
import com.example.demo.repositories.PlanetRepository;
import com.example.demo.repositories.PlanetTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Assignment1PlanetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Assignment1PlanetsApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(

            PlanetRepository planetRepository,
            PlanetTypeRepository planetTypeRepository) {

        return (args) -> {

            final List<Planet> planets = new ArrayList<>();
            final List<PlanetType> planetTypes = new ArrayList<>();
            planets.add(new Planet("Mercury", 0.330,4.879));
            planets.add(new Planet("Venus",4.87,12.104));
            planets.add(new Planet("Earth",5.97,12.756));
            planetTypes.add(new PlanetType("Gas"));
            planetTypes.add(new PlanetType("Ice"));
            planetRepository.saveAll(planets);
            planetTypeRepository.saveAll(planetTypes);

        };

    }
}

