package com.example.demo.controllers;

import com.example.demo.Service.PlanetService;
import com.example.demo.models.Planet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/planets")
public class PlanetController {

    PlanetService planetService;

    PlanetController(PlanetService planetService) {
        this.planetService = planetService;

    }
    @GetMapping()
    public Iterable<Planet> findAll(){
    return planetService.findAll();
    }
    //wtf
    @GetMapping("/{id}")
    public ResponseEntity<Planet> findPlanetById(@PathVariable("id") int id){
        Optional<Planet> planet = Optional.of(planetService.findById(id).orElseThrow(() -> new RuntimeException("not found")));
        return ResponseEntity.ok().body(planet.get());
    }

    /*@RequestMapping("{id}")
    public String getMessageById(@PathVariable("id") int id) {
        Optional optional = planetService.findById(id);
        Gson json = new Gson();
        Planet planet = (Planet) optional.get();

        return json.toJson(planet);
    }*/

}
