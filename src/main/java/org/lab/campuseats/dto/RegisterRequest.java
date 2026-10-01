package org.lab.campuseats.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message = "El username es obligatorio y unico") String username,
        @NotBlank(message = "El email es obligatorio y unico") @Email(message = "Email inválido") String email,
        @NotBlank @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres") String password
) {}
