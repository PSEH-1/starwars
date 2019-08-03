package com.starwars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StarWars {

    @Id
    @GeneratedValue
    private Long id;
    public StarWars() {
		super();
		this.name = "default";
	}
    public StarWars(String name) {
		super();
		this.name = name;
	}
	public StarWars(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
}
