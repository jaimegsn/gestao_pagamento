package com.gestaopagamentos.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class TransactionLog {
    private Long id;
    private Long totalTransactionsNumber;
    private LocalDate lastLogUpdated;

    private Double avgTransactionNumberPerDay;
    private Double avgTransactionNumberPerMonth;
    private Double avgTransactionNumberPerYear;
    private Double avgTransactionAmountPerDay;
    private Double avgTransactionAmountPerMonth;
    private Double avgTransactionAmountPerYear;

    private Long transactionRevenueNumber;
    private Long transactionExpenseNumber;

    private Double totalRevenueAmountInMonth;
    private Double totalRevenueAmountInYear;
    private Double totalExpenseAmountInMonth;
    private Double totalExpenseAmountInYear;

    private Map<String, Double> avgTransactionPerMethodPayment;
    private Map<String, Double> avgTransactionPerMethodPaymentInAMonth;
    private Map<String, Double> avgTransactionPerBankAccount;
    private Map<String, Double> avgTransactionPerBankAccountInAMonth;
}
