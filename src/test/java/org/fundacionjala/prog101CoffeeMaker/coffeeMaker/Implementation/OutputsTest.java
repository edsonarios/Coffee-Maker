package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.Pot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutputsTest {

    @Test
    public void formatColorGreen_StringColorGreen() {
        final String colorReset = "\u001B[0m";
        final String colorGreen = "\u001B[32m";
        Outputs outputs = new Outputs();
        String expected = colorGreen + "this text in color green" + colorReset;
        String actual = outputs.formatColorGreen("this text in color green");
        assertEquals(expected, actual);
    }
    @Test
    public void formatError_StringColorRed() {
        final String colorReset = "\u001B[0m";
        final String colorRed = "\u001B[31m";
        Outputs outputs = new Outputs();
        String expected = colorRed + "Error : " + "this text in color red" + colorReset;
        String actual = outputs.formatError("this text in color red");
        assertEquals(expected, actual);
    }
    @Test
    public void printHead_StringHead() {
        Outputs outputs = new Outputs();
        String message1 = "-----------------------------------\n";
        String message2 = "    Welcome to Coffee Maker\n";
        String message3 = "-----------------------------------";
        String expected = message1 + message2 + message3;
        String actual = outputs.printHead();
        assertEquals(expected, actual);
    }
    @Test
    public void printInstructions_StringInstructions() {
        Outputs outputs = new Outputs();
        String message1 = "1. Init Coffee Maker\n";
        String message2 = "2. Load 12 glasses of water\n";
        String message3 = "3. Load coffee beans into the filter\n";
        String message4 = "4. Load Pot over Plate Heater\n";
        String message5 = "5. Remove Pot of over Plate Heater\n";
        String message6 = "6. Exit\n";
        String message7 = "-----------------------------------\n";
        String message8 = "Choose one option :";
        String expected = message1 + message2 + message3 + message4 + message5 + message6 + message7 + message8;
        String actual = outputs.instructions();
        assertEquals(expected, actual);
    }
}