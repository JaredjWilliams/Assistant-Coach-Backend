package com.theassistantcoach.rest.webservices.assistantcoachbackend.JpaInterfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theassistantcoach.rest.webservices.assistantcoachbackend.models.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Long> {

	List<Profile> findByCreaterUsername(String username);

}
