package org.example.splitwise.service;

import org.example.splitwise.model.Split;
import org.example.splitwise.model.User;
import org.example.splitwise.model.UserExpenseBalanceSheet;

import java.util.List;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User paidBy, List<Split> splits, double totalAmount) {
        UserExpenseBalanceSheet paidByUserExpenseSheet = paidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalAmount);

    }
}
