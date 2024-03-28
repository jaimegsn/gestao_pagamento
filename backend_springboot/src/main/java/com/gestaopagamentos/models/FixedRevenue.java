package com.gestaopagamentos.models;

import com.gestaopagamentos.enums.Fee;

import java.time.LocalDate;

public class FixedRevenue {
    private Long id;
    private String name;
    private String description;
    private Double amount;
    private String typeOfCurrency;
    private LocalDate receivedDate;
    private Boolean isFixedAmount;
    private Integer paymentFrequencyInMonths;
    private Integer numberOfDelays;
    private Fee fee;
}
