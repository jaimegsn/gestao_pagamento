package com.gestaopagamentos.models;

import java.time.Instant;
import java.time.LocalDate;

public class RevenueLog {
    private Long id;
    private Double currentTotalRevenueAmountInMonth;
    private Double expectedRevenueAmountInMonth;
    private Double revenueAmountRemainsToReceive;
    private LocalDate dateUpdatedLog;
    private Instant dateAdded = Instant.now();
}
