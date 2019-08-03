package com.starwars.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	private String type;
	private String count;
	private String name;
	private String films;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilms() {
		return films;
	}
	public void setFilms(String films) {
		this.films = films;
	}
	@Override
	public String toString() {
		return "Result [type=" + type + ", count=" + count + ", name=" + name + ", films=" + films + "]";
	}
	
}
