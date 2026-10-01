package org.lab.campuseats.event;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Map;


public record OrderConfirmedEvent(Long orderId, String username, String email, String restaurantName,
                                  int itemsCount, BigDecimal total, Map<String, Integer> quantityByCategory,
                                  ZonedDateTime occurredAt) {}
