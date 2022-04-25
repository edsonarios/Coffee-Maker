package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerCoffeeMakerTest {

    @Test
    public void removePotOverPlateHeater_WhenIWantRemovePotAgain_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.removePotOverPlateHeater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePotOverPlateHeater_WhenIWantRemovePot_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.removePotOverPlateHeater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadPotOverHeaterPlatePot_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadPotOverHeaterPlatePot_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadWater_ThereArentWater_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.loadWater(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadWater_ThereAreWater_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadWater(12);
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.loadWater(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadCoffeeBeans_WhenThereAreCoffee_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadCoffeeBeans();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.loadCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadCoffeeBeans_WhenThereArentCoffee_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.loadCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void verifyConditionsForCoffeeMaker() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.verifyConditionsForCoffeeMaker();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printForInterface_WhenPrintOnInterfaceInmediatlyClean_StringEmpty() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        String expected = "";
        String actual = controllerCoffeeMaker.printForInterface();
        Assert.assertEquals(expected, actual);
    }
}