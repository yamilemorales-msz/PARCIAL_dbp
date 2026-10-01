package org.lab.campuseats.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record OrderStatusRequest(
        @NotBlank(message = "status es obligatorio")
        @Pattern(regexp = "^(ALL|CONFIRMED|READY|CANCELLED)$",
                message = "status debe ser ALL, CONFIRMED, READY o CANCELLED") String status
) {}
