package com.starwars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.service.StarWarsService;
import com.starwars.util.Result;

@RestController
public class StarWarsController {

    // Find
    @GetMapping("/starwarsPing")
    String starwarsPing() {
        return "Running fine";
    }
    
    @GetMapping("/starwarsDetails")
    @ResponseBody
    Result getFoos(@RequestParam String type, @RequestParam String name) {
    	StarWarsService stService = new StarWarsService();
        return StarWarsService.getDetails(type, name);
    }

}
