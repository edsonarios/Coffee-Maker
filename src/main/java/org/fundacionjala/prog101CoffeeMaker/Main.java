package org.fundacionjala.prog101CoffeeMaker;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation.ControllerCoffeeMaker;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) throws InterruptedException {
        ControllerCoffeeMaker coffeeMaker = new ControllerCoffeeMaker();
        coffeeMaker.initialize();
    }
}
