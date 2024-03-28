package com.gestaopagamentos.services;

import com.gestaopagamentos.enums.Fee;
import com.gestaopagamentos.models.ExpenseCategory;
import com.gestaopagamentos.models.ExpenseLog;
import com.gestaopagamentos.models.FixedExpense;

public class ExpenseService {
    public void registerFixedExpense(FixedExpense fixedExpense){

    }
    public void getFixedExpense(Long id){

    }
    public void updateFixedExpense(Long id, FixedExpense fixedExpense){

    }
    public void deleteFixedExpense(Long id){

    }
    public void getAllFixedExpenses(){

    }

    public void registerExpenseCategory(ExpenseCategory expenseCategory){

    }
    public void getExpenseCategory(Long id){

    }
    public void updateExpenseCategory(Long id, ExpenseCategory expenseCategory){

    }
    public void deleteExpenseCategory(Long id){

    }
    public void getAllExpenseCategories(){

    }

    public void getComparativeHistoryLast12MonthsExpenseCategory(String category){

    }
    public void getComparativeHistoryLast12MonthsExpenseCategories(){

    }
    public void getComparativeCurrentAmountExpenseCategory(String category){

    }
    public void getComparativeHistoryLast12MonthsExpenses(){

    }
    public void getCurrentTotalAmountExpense(){

    }

    public void simuateFees(int months, Fee fee, int numberOfDelays, double monthAmount){

    }
    public void calculateAmountWithFee(Fee fee, int numberOfDelays, double monthAmount){

    }

    private void createExpenseLog(ExpenseLog expenseLog){

    }
    public void getExpenseLog(){

    }
    private void updateExpenseLog(){

    }
    private void deleteExpenseLog(){

    }
}
