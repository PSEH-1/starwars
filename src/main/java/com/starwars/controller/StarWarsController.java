package com.starwars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.model.StarWars;
import com.starwars.repository.StarWarsRepository;
import com.starwars.service.StarWarsService;
import com.starwars.util.Result;

@RestController
public class StarWarsController {

    @Autowired
    private StarWarsRepository repository;
    
    // Find
    @GetMapping("/starwarsPing")
    String starwarsPing() {
        return "Running fine";
    }
    // Find
    @GetMapping("/starwars")
    List<StarWars> findAll() {
        return repository.findAll();
    }
    
    @GetMapping("/starwarsDetails")
    @ResponseBody
    Result getFoos(@RequestParam String type, @RequestParam String name) {
    	StarWarsService stService = new StarWarsService();
        return StarWarsService.getDetails(type, name);
    }

}
