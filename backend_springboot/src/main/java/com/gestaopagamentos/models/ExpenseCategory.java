package com.gestaopagamentos.models;

import java.util.ArrayList;
import java.util.List;

public class ExpenseCategory {
    private Long id;
    private String name;
    private Double amountInMonth;
    private Double budget;
    private Double spendingCeiling;
    private List<FixedExpense> fixedExpenses = new ArrayList<>();

}
