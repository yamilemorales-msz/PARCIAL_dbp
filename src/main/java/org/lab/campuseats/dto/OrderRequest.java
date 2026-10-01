package org.lab.campuseats.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;


public record OrderRequest(
        @NotNull(message = "storeId es obligatorio") Long storeId,
        @NotEmpty(message = "El pedido debe tener al menos un producto") @Valid List<OrderItemRequest> items,
        @Size(max = 200, message = "Máximo 200 caracteres") String note
) {}
