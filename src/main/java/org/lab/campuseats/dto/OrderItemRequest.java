package org.lab.campuseats.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record OrderItemRequest(
        @NotNull(message = "productId es obligatorio") Long productId,
        @NotNull(message = "quantity es obligatorio") @Min(value = 1, message = "Mínimo 1")
        @Max(value = 20, message = "Máximo 20") Integer quantity
) {}
