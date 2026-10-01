package org.lab.campuseats.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity(name = "CustomerOrder")
@Table(name = "orders")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long productId;

    private String note;

    @Column(nullable = false)
    private BigDecimal total;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private ZonedDateTime createdAt;
}
