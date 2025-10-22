package org.example.splitwise.model;

import org.example.splitwise.service.ExpenseController;

import java.util.List;

public class Group {
    String id;
    String name;
    List<User> users;
    List<Expense> expenseList;
    ExpenseController expenseController;
}
