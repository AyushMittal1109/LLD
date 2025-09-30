package org.example.splitwise.model;

import org.example.splitwise.constant.ExpenseSplitType;

import java.util.ArrayList;
import java.util.List;

/*
    Expense is a dumb class, will be controlled by Expense Controller
 */

public class Expense {
    String expenseId;
    String description;
    double expenseAmount;
    User paidByuser;
    ExpenseSplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(String expenseId, String description, double expenseAmount,
                   User paidByuser, ExpenseSplitType splitType,
                   List<Split> splitDetails) {
        this.expenseId = expenseId;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.paidByuser = paidByuser;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
    }
}
