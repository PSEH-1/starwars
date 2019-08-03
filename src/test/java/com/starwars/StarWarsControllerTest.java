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
    public void pingTheService() throws Exception {
        mockMvc.perform(get("/starwarsPing"))
                .andExpect(status().isOk());   
    }
    
    @Test
    public void testError404() throws Exception {
        mockMvc.perform(get("/starwarsPingError"))
                .andExpect(status().is4xxClientError());   
    }    
  
    @Test
    public void testPlanets() throws Exception {

        mockMvc.perform(get("/starwarsDetails")
                .param("type", "planets")
                .param("name", "Alderaan"))       
          .andExpect(status().isOk());
    }
    @Test
    public void testPlanetsForCountAndFilms() throws Exception {

    }   
    @Test
    public void testPlanetsError() throws Exception {

    }
    
    
    @Test
    public void testPeople() throws Exception {
    	
        mockMvc.perform(get("/starwarsDetails")
                .param("type", "people")
                .param("name", "C-3PO"))       
          .andExpect(status().isOk());   

    }
    
    @Test
    public void testPeopleForCountAndFilms() throws Exception {

    }   
    
    @Test
    public void testPeopleError() throws Exception {

    }   
    
    
    @Test
    public void testSpecies() throws Exception {
    	
        mockMvc.perform(get("/starwarsDetails")
                .param("type", "species")
                .param("name", "Hutt"))       
          .andExpect(status().isOk());   

    }
    @Test
    public void testSpeciesForCountAndFilms() throws Exception {

    }   
    @Test
    public void testSpeciesError() throws Exception {

    }    
    
    
    @Test
    public void testVehicles() throws Exception {
    	
        mockMvc.perform(get("/starwarsDetails")
                .param("type", "vehicles")
                .param("name", "Sand Crawler"))       
          .andExpect(status().isOk());   
    }
    @Test
    public void testVehiclesForCountAndFilms() throws Exception {

    }
    @Test
    public void testVehiclesError() throws Exception {
    }        

    @Test
    public void testStarShips() throws Exception {
    	
        mockMvc.perform(get("/starwarsDetails")
                .param("type", "starships")
                .param("name", "Executor"))       
          .andExpect(status().isOk());   

    }
    
    @Test
    public void testStarShipsForCountAndFilms() throws Exception {


    }
    @Test
    public void testStarShipsError() throws Exception {

    }   
    
    
}
