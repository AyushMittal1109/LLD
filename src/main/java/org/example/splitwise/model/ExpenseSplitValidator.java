package org.example.splitwise.model;

import java.util.List;

public interface ExpenseSplitValidator {
    public boolean validateRequest(List<Split> splitList, double totalAmount);
}
