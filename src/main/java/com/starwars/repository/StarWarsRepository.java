package com.starwars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.model.StarWars;

public interface StarWarsRepository extends JpaRepository<StarWars, Long> {
}
