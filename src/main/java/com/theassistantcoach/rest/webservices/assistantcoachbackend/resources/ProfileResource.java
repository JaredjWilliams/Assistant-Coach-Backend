package com.theassistantcoach.rest.webservices.assistantcoachbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.theassistantcoach.rest.webservices.assistantcoachbackend.JpaInterfaces.ProfileRepo;
import com.theassistantcoach.rest.webservices.assistantcoachbackend.models.Profile;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProfileResource {

	@Autowired
	private ProfileRepo profileRepo;
	
	@GetMapping("users/{username}profiles")
	public List<Profile> getAllProfiles(@PathVariable String username) {
		return profileRepo.findByCreaterUsername(username);
	}
}
