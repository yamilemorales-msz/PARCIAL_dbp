package org.lab.campuseats.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Map;

public record MetricsResponse(long totalOrders, long totalItemsSold, long totalCancellations, BigDecimal totalRevenue,
                              Map<String, Long> itemsByCategory, ZonedDateTime lastUpdated) {}
