package org.lab.campuseats.dto;

public record LoginResponse(String token, long expiresIn) {}