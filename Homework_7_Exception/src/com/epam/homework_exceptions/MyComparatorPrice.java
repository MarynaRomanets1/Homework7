package com.epam.homework_exceptions;

import java.util.Comparator;

public class MyComparatorPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        double price1 = ((Book)o1).getPrice();
        double price2 = ((Book)o2).getPrice();
        if (price1 > price2) return -1;
        if (price1 < price2) return 1;
        return 0;
    }
}
