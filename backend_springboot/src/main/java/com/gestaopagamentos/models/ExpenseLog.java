package com.gestaopagamentos.models;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Map;

public class ExpenseLog {
    private Long id;
    private Instant dateAdded = Instant.now();
    private LocalDate dateUpdatedLog;
    private Double totalExpensesAmountInMonth;
    private Double totalBudgetAmount;
    private Double totalSpendingCeilingLimit;
    private Map<String, Double[]> last12TotalExpensesAmountInEachMonth;
    private Map<String, Map<String, Double[]>> last12SpecificExpenseCategoryAmountInEachMonth;
}
