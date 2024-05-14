package model.entities;

import java.util.UUID;

public class User {

	private String name;
	
	private UUID ID;
	
	private Role role;
	
	public User(String name, Role role) {
		this.name = name;
		this.role = role; 
		this.ID = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getID() {
		return ID;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
		
}