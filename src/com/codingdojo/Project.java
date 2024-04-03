package com.codingdojo;

public class Project {
	
	private String name;
	private String description;
	
	public Project(){
		this.name = "N/A";
		this.description = "N/A";
	}
	
	public Project(String name){
		this.name = name;
		this.description = "N/A";
	}
	
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String elevatorPitch() {
		return this.name + ": " + this.description;
		
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
