package com.cognizant.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import com.cognizant.authservice.util.JwtUtil;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public TokenResponse authenticate(Authentication authentication) {
        // Spring automatically injects the authenticated user
        String token = jwtUtil.generateToken(authentication.getName());
        return new TokenResponse(token);
    }

    public record TokenResponse(String token) {}
}
