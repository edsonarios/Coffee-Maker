package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

public class Outputs {
    private String response;
    private final String colorReset = "\u001B[0m";
    private final String colorBlack = "\u001B[30m";
    private final String colorRed = "\u001B[31m";
    private final String colorGreen = "\u001B[32m";
    private final String colorYellow = "\u001B[33m";
    private final String colorBlue = "\u001B[34m";
    private final String colorPurple = "\u001B[35m";
    private final String colorCyan = "\u001B[36m";
    private final String colorWhite = "\u001B[37m";
    private String printForInterface = "";
    /**
     * Print method
     * @param message
     */
    public void print(final String message) {
        System.out.println(message);
    }

    /**
     * erase the String for graphical interface
     */
    public void eraseStringForInterface() {
        printForInterface = "";
    }

    /**
     * String with all message for function
     * @return
     */
    public String printForInterface() {
        return printForInterface;
    }


    /**
     * Changed format for print error in color red
     * @param message
     */
    public String formatError(final String message) {
        printForInterface += message + "\n";
        return colorRed + "Error : " + message + colorReset;
    }

    /**
     * Changed format for print in color green
     * @param message
     */
    public String formatColorGreen(final String message) {
        printForInterface += message + "\n";
        return colorGreen + message + colorReset;
    }

    /**
     * Changed format for print in color yellow
     * @param message
     */
    public String formatColorYellow(final String message) {
        printForInterface += message + "\n";
        return colorCyan + message + colorReset;
    }

    /**
     * print head for Coffee Maker
     */
    public String printHead() {
        String message1 = "-----------------------------------\n";
        String message2 = "    Welcome to Coffee Maker\n";
        String message3 = "-----------------------------------";
        return message1 + message2 + message3;
    }

    /**
     * print instructions
     */
    public String instructions() {
        String message1 = "1. Init Coffee Maker\n";
        String message2 = "2. Load 12 glasses of water\n";
        String message3 = "3. Load coffee beans into the filter\n";
        String message4 = "4. Load Pot over Plate Heater\n";
        String message5 = "5. Remove Pot of over Plate Heater\n";
        String message6 = "6. Exit\n";
        String message7 = "-----------------------------------\n";
        String message8 = "Choose one option :";
        return message1 + message2 + message3 + message4 + message5 + message6 + message7 + message8;
    }


}
