package ch.minh.uebungen;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<String> items = new ArrayList<>();
    private boolean bookAdded = false;

    public void addItem(String item) {
        items.add(item);
        if (item.equalsIgnoreCase("book")) {
            bookAdded = true;
        }
    }

    public void removeItem(String item) {
        items.remove(item);
        bookAdded = items.stream()
                .anyMatch(i -> i.equalsIgnoreCase("book"));
    }

    public List<String> getItems() {
        return items;
    }

    public int getDiscountPercentage() {
        return bookAdded ? 5 : 0;
    }
}