package com.starwars.error;

public class StarWarsNotFoundException extends RuntimeException {

    public StarWarsNotFoundException(Long id) {
        super("StarWars id not found : " + id);
    }

}
