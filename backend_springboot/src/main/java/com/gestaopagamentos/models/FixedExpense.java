package com.gestaopagamentos.models;

import com.gestaopagamentos.enums.Fee;

import java.time.LocalDate;

public class FixedExpense {
    private Long id;
    private String name;
    private String description;
    private String observations;
    private String typeOfCurrency;
    private Double totalAmount;
    private ExpenseCategory expenseCategory;
    private Integer paymentFrequencyInMonths;
    private LocalDate billingDate;
    private Integer totalInstallments;
    private Integer currentInstallment;
    private Boolean isRecurring;
    private Fee fee;
    private Integer numberOfDelays;
    private Boolean isPaidOut;
}
