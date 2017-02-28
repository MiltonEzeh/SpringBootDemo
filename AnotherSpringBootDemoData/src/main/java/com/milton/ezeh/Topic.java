package com.milton.ezeh;

import javax.persistence.Entity;
import javax.persistence.Id;

// Entity class that needs to be saved to database

@Entity
// this will create a table called Topic with columns named after field
public class Topic {
	@Id
	// make Id primary key
	private String id;
	private String name;
	private String description;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Topic() {
		
	}
	
	
	

}
