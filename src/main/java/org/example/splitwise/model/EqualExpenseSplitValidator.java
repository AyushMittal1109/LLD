package org.example.splitwise.model;

import java.util.List;

public class EqualExpenseSplitValidator implements ExpenseSplitValidator {
    @Override
    public boolean validateRequest(List<Split> splitList, double totalAmount) {
        return false;
    }
}

