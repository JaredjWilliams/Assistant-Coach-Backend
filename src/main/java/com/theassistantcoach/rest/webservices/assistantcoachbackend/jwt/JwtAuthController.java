package com.theassistantcoach.rest.webservices.assistantcoachbackend.jwt;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class JwtAuthController {
	
	private final JwtTokenService tokenService;
	
	private final AuthenticationManager authenticationManager;

	public JwtAuthController(JwtTokenService tokenService, AuthenticationManager authenticationManager) {
		this.tokenService = tokenService;
		this.authenticationManager = authenticationManager;
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<JwtTokenResponse> generateToken(
			@RequestBody JwtTokenRequest jwtTokenRequest) {
		
		var authenticationToken = new UsernamePasswordAuthenticationToken(
				jwtTokenRequest.username(),
				jwtTokenRequest.password());
		
		var authentication = authenticationManager.authenticate(authenticationToken);
		
		var token = tokenService.generateToken(authentication);
		
		return ResponseEntity.ok(new JwtTokenResponse(token));
	}
	
	
	

	

}
