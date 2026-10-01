package org.lab.campuseats.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank(message = "El nombre es obligatorio") String name,
        @NotBlank(message = "La categoría es obligatoria")
        @NotNull(message = "El precio es obligatorio")
        @DecimalMin(value = "0.10", message = "El precio mínimo es 0.10")
        @DecimalMax(value = "999.99", message = "El precio es demasiado alto") BigDecimal price,
        @NotNull(message = "El stock es obligatorio")
        @Min(value = 0, message = "El stock no puede ser negativo")
        @Max(value = 1000, message = "El stock máximo es 1000") Integer stock
) {}
