package org.lab.campuseats.dto;

public record StoreResponse(Long id, String ownerUsername, String name, String location, Boolean open) {}
