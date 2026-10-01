package org.lab.campuseats.event;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Map;

public record OrderCancelledEvent(Long orderId, String username, String email, String restaurantName,
                                  int itemsCount, BigDecimal total, Map<String, Integer> quantityByCategory,
                                  String reason, ZonedDateTime occurredAt) {}
