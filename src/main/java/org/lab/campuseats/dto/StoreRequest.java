package org.lab.campuseats.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record StoreRequest(
        @NotBlank(message = "El nombre es obligatorio") @Size(max = 100, message = "Máximo 100 caracteres") String name,
        @NotBlank(message = "La ubicación es obligatoria") String location
) {}
