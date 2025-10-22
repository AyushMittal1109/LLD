package org.example.splitwise.model;

import java.util.Map;

public class UserExpenseBalanceSheet {
    Map<User, Balance> friendBalanceSheet;
    // looks like Balance is not required, we can maintain double

    double totalMyExpense;
    double totalPayment;
    double totalOwe;
    double totalGetBack;

    public Map<User, Balance> getFriendBalanceSheet() {
        return friendBalanceSheet;
    }

    public void setFriendBalanceSheet(Map<User, Balance> friendBalanceSheet) {
        this.friendBalanceSheet = friendBalanceSheet;
    }

    public double getTotalMyExpense() {
        return totalMyExpense;
    }

    public void setTotalMyExpense(double totalMyExpense) {
        this.totalMyExpense = totalMyExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }
}
