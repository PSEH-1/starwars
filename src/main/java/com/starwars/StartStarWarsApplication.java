package com.starwars;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.starwars.model.StarWars;
import com.starwars.repository.StarWarsRepository;

import java.math.BigDecimal;

@SpringBootApplication
public class StartStarWarsApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartStarWarsApplication.class, args);
    }

    // run this only on profile 'demo', avoid run this in test
    @Profile("demo")
    @Bean
    CommandLineRunner initDatabase(StarWarsRepository repository) {
        return args -> {
            repository.save(new StarWars("Rosewin"));
            repository.save(new StarWars("Ram"));
            repository.save(new StarWars("Gopal"));
        };
    }
}