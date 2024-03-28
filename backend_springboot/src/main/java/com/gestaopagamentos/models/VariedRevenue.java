package com.gestaopagamentos.models;

import com.gestaopagamentos.enums.Fee;

import java.time.LocalDate;

public class VariedRevenue {
    private Long id;
    private String name;
    private String description;
    private Double amountPerMonth;
    private Double totalAmount;
    private String typeOfCurrency;
    private LocalDate receivedDate;
    private LocalDate deadLine;
    private Boolean isReceived;
    private Integer paymentFrequencyInMonths;
    private Boolean isRecurring;
    private Integer totalInstallments;
    private Integer currentInstallment;
    private Integer numberOfDelays;
    private Fee fee;
}
