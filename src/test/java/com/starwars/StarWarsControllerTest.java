package com.starwars;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

//@WebMvcTest(StarWarsController.class)
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class StarWarsControllerTest {

    private static final ObjectMapper om = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void init() {
    }
    
    @Test
    public void testError() throws Exception {

        mockMvc.perform(get("/starwarsPing"))
                .andExpect(status().isOk());

    }    
    
    @Test
    public void pingTheService() throws Exception {

        mockMvc.perform(get("/starwarsPing"))
                .andExpect(status().isOk());

    }
    @Test
    public void testPlanets() throws Exception {

    }

    @Test
    public void testPeople() throws Exception {

    }
    
    @Test
    public void testFilms() throws Exception {

    }
    
    @Test
    public void testSpecies() throws Exception {

    }
    
    @Test
    public void testVehicles() throws Exception {
    }
    
    @Test
    public void testStarShips() throws Exception {

    }
    
    
}
