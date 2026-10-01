package org.lab.campuseats.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record ProductResponse(Long id, Long storeId, String name, String description, String category,
                              BigDecimal price, Integer stock, String status, ZonedDateTime publishedAt) {}
