package org.lab.campuseats.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record ProductListItem(Long id ,String storeName, String name, String category, BigDecimal price, Integer stock,
                              Long storeId, Boolean storeOpen,
                              ZonedDateTime publishedAt) {}
