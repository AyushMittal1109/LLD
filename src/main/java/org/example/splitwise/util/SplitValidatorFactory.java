package org.example.splitwise.util;

import org.example.splitwise.constant.ExpenseSplitType;
import org.example.splitwise.model.EqualExpenseSplitValidator;
import org.example.splitwise.model.ExpenseSplitValidator;

public class SplitValidatorFactory {
    public static ExpenseSplitValidator getSplitsValidatorObject(ExpenseSplitType expenseSplitType) {
        switch (expenseSplitType) {
            case EQUAL : return new EqualExpenseSplitValidator();
            default :
                System.out.println("illegal split type");
                return null;
        }
    }
}
