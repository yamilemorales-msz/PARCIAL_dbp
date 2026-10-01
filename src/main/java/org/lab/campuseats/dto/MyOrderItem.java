package org.lab.campuseats.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record MyOrderItem(Long id, String storeName, Integer itemsCount, BigDecimal total,
                          String status, ZonedDateTime createdAt) {}
