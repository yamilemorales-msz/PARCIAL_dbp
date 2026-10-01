package org.lab.campuseats.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

public record OrderResponse(Long id, Long storeId, String storeName, String username,
                            List<OrderItemResponse> items, BigDecimal total, String note,
                            String status, ZonedDateTime createdAt) {}
