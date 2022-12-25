package io.github.kennedfer;

import io.github.kennedfer.coffes.Coffe;
import io.github.kennedfer.factory.CoffeType;
import io.github.kennedfer.factory.CoffeFactory;

public class Test {
    public static void main(String[] args) {
        Coffe coffe1 = CoffeFactory.getCoffe(CoffeType.EXPRESS);

        System.out.printf("The ordered coffe has: %s", coffe1.getName());
        System.out.println();
        System.out.printf("Price: $%.2f", coffe1.getPrice());
    }
}
