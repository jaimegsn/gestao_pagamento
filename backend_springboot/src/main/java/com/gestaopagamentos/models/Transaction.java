package com.gestaopagamentos.models;

import com.gestaopagamentos.enums.PaymentMethod;

import java.time.Instant;

public class Transaction {
    private Long id;
    private String payer;
    private String receiver;
    private String description;
    private Double amount;
    private String typeOfCurrency;
    private Instant date;
    private BankAccount bankAccount;
    private PaymentMethod paymentMethod;
}
