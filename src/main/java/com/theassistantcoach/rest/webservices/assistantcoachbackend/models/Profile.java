package com.theassistantcoach.rest.webservices.assistantcoachbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private byte[] profilePicture;
	private String createrUsername;
	
	public Profile() {
		
	}
	
	public Profile(long id, String name, byte[] profilePicture, String createrUsername) {
		this.id = id;
		this.name = name;
		this.profilePicture = profilePicture;
		this.createrUsername = createrUsername;
	}

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

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getCreaterUsername() {
		return createrUsername;
	}

	public void setCreaterUsername(String createrUsername) {
		this.createrUsername = createrUsername;
	}
	
}
