package org.example.splitwise.model;

/*
 User is a dumb class
 User controller will control it
 */
public class User {
    String userId;
    String name;
    UserExpenseBalanceSheet userExpenseBalanceSheet;


    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }
}
