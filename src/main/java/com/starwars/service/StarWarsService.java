package com.starwars.service;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import com.starwars.util.*;

public class StarWarsService {	
	/*
	 pass type and name as arguments.
	 type can be planets, people etc.
	 */
	public static Result getDetails(String type,String name){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent", "*");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		Object response = restTemplate.exchange("https://swapi.co/api/"+type, HttpMethod.GET,entity,Object.class);        
		//TBD - JSON parser to be used here
		Result result = new Result();
		result.setType(type);
		result.setName(name);
		result.setFilms("ToBeDone");
		result.setCount(response.toString().substring(response.toString().indexOf("<200,{count=")+12,response.toString().indexOf(", next")));
		return result;
	}
	
	public static void main(String args[]) {
	       
		StarWarsService st = new StarWarsService();
		System.out.println(st.getDetails("planets","Alderaan"));
	}
	
}
