package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import java.util.Scanner;

public class Inputs {
    private String option;
    private Scanner scanner;

    /**
     * Scans all inputs
     * @return String
     */
    public String scanner() {
        scanner = new Scanner(System.in);
        option = scanner.nextLine();
        return option;
    }


}
