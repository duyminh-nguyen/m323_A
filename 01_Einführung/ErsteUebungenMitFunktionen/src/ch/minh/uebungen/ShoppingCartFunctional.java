package ch.minh.uebungen;

import java.util.List;

public class ShoppingCartFunctional {

    public static int getDiscountPercentage(List<String> items) {
        return items.stream()
                .anyMatch(i -> i.equalsIgnoreCase("book")) ? 5 : 0;
    }
}