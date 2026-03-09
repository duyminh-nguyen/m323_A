package ch.minh.uebungen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Aufgabe 1
        System.out.println(ScoreCalculator.calculateScore("imperative"));
        System.out.println(ScoreCalculator.wordScore("declarative"));

        // Aufgabe 2 imperativ
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("book");
        cart.addItem("pen");
        System.out.println(cart.getDiscountPercentage());

        // Aufgabe 2 funktional
        System.out.println(
                ShoppingCartFunctional.getDiscountPercentage(
                        Arrays.asList("pen")
                )
        );

        // Aufgabe 3
        System.out.println(
                TipCalculator.calculateTipPercentage(
                        Arrays.asList("Fritz", "Franz", "Hugo", "Erwin", "Markus", "Martin", "Heiri")
                )
        );
    }
}
