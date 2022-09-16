package com.example.demo;

import com.example.demo.models.Planet;
import com.example.demo.models.PlanetType;
import com.example.demo.models.Reservation;
import com.example.demo.models.Spaceship;
import com.example.demo.repositories.PlanetRepository;
import com.example.demo.repositories.PlanetTypeRepository;
import com.example.demo.repositories.SpaceshipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Assignment1PlanetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Assignment1PlanetsApplication.class, args);
    }


    @Bean
    public CommandLineRunner importData(

            PlanetRepository planetRepository,
            PlanetTypeRepository planetTypeRepository,
            SpaceshipRepository spaceshipRepository) {

        return (args) -> {

            final List<Planet> planets = new ArrayList<>();
            final List<PlanetType> planetTypes = new ArrayList<>();
            final List<Spaceship> spaceships = new ArrayList<>();
            planets.add(new Planet("Mercury", 0.330,4.879,new ArrayList<>(Arrays.asList(new PlanetType("Gas"),new PlanetType("Ice"))),"https://www.pngall.com/wp-content/uploads/2/Mercury-Planet-PNG-Pic.png"));
            planets.add(new Planet("Venus",4.87,12.104,new ArrayList<>(Arrays.asList(new PlanetType("Gas"))),"https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Venus_globe_-_transparent_background.png/2048px-Venus_globe_-_transparent_background.png"));
            planets.add(new Planet("Earth",5.97,12.756, new ArrayList<>(Arrays.asList(new PlanetType("Water"))),"https://upload.wikimedia.org/wikipedia/commons/2/22/Earth_Western_Hemisphere_transparent_background.png"));
            planets.add(new Planet("Saturn", 5.330,116,new ArrayList<>(Arrays.asList(new PlanetType("Gas"))),"https://nineplanets.org/wp-content/uploads/2020/03/saturn.png"));
            planetRepository.saveAll(planets);

        };
        }



}

