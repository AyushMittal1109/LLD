package org.example.splitwise.service;

import org.example.splitwise.constant.ExpenseSplitType;
import org.example.splitwise.model.Expense;
import org.example.splitwise.model.ExpenseSplitValidator;
import org.example.splitwise.model.Split;
import org.example.splitwise.model.User;
import org.example.splitwise.util.SplitValidatorFactory;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController(BalanceSheetController balanceSheetController) {
        this.balanceSheetController = balanceSheetController;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType expenseSplitType, User paidByUser) {
        ExpenseSplitValidator expenseSplitValidator = SplitValidatorFactory.getSplitsValidatorObject(expenseSplitType);
        try {
            expenseSplitValidator.validateRequest(splitDetails, expenseAmount);
        } catch (NullPointerException e) {
            System.out.println("Invalid expense type");
        }

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, expenseSplitType, splitDetails);
        balanceSheetController.


    }
}
