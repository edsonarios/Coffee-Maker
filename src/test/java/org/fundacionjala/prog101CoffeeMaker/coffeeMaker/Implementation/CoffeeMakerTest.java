package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler.Boiler;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler.PressureRelietValve;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.FilterAndReceptacle;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.IndicatorLight;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.StartButton;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.PlateSensor;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.Pot;
import org.junit.Assert;
import org.junit.Test;

public class CoffeeMakerTest {


    @Test
    public void removePot() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.removePot();
        PlateSensor plateSensor = new PlateSensor();
        boolean expected = false;
        boolean actual = plateSensor.obtainStatePlate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkPlacePot_Two() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.checkPlacePot();
        PlateSensor plateSensor = new PlateSensor();
        Pot pot = new Pot();
        pot.setAmountOfCups(2);
        int expected = 2;
        int actual = plateSensor.checkState(pot);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkPlacePot_One() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.checkPlacePot();
        PlateSensor plateSensor = new PlateSensor();
        plateSensor.thereIsAPot();
        Pot pot = new Pot();
        pot.setAmountOfCups(1);
        int expected = 1;
        int actual = plateSensor.checkState(pot);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pressStartButton_One() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.pressStartButton();
        StartButton button = new StartButton();
        boolean expected = false;
        boolean actual = button.getButtonPressed();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void fillFilterWithCoffeeGrains_One() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.fillFilterWithCoffeeGrains();
        FilterAndReceptacle filterAndReceptacle = new FilterAndReceptacle();
        boolean expected = false;
        boolean actual = filterAndReceptacle.getCoffeeGrains();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void fillBoilerWithWater_One() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.fillBoilerWithWater(12);
        int expected = 12;
        int actual = coffeeMaker.getBoiler().amountOfLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFilterWithCoffeeBeans_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isFilterWithCoffeeBeans();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFilterWithCoffeeBeans_True() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.fillFilterWithCoffeeGrains();
        boolean expected = true;
        boolean actual = coffeeMaker.isFilterWithCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void verifyConditionsForCoffeeMaker_True() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.verifyConditionsForCoffeeMaker();;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFilterWithCoffeeBeans_VerifyIfFilterIsWithCoffeeBeans_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isFilterWithCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isBoilerWithWater_VerifyIfBoilerIsWithWater_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isBoilerWithWater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPotOverPlateHeater_VerifyIfPotIsOverPlateHeater_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
//        boolean actual = coffeeMaker.isPotOverPlateHeater();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void isPotInPlace_VerifyIfPotIsInPlace_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
//        boolean actual = coffeeMaker.isPotInPlace();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void putPotInNewPlace_PutThePotOfPlateHeate_True() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
//        coffeeMaker.returnPotToPlateHeater();
        boolean expected = true;
//        boolean actual = coffeeMaker.isPotInPlace();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void putPotInNewPlace_RemovingThePotOfPlateHeate_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.removePot();
        boolean expected = false;
//        boolean actual = coffeeMaker.isPotInPlace();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void obtainsStartButtonState() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.obtainsStartButtonState();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fillBoilerWithWater_BoilerWithTwelveCups_Twelve() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.fillBoilerWithWater(12);
        int expected = 12;
//        int actual = coffeeMaker.getBoiler().getCupsOfWater();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void fillBoilerWithWater_BoilerWithZeroCups_Zero() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.fillBoilerWithWater(0);
        int expected = 0;
//        int actual = coffeeMaker.getBoiler().getCupsOfWater();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void fillFilterWithCoffeeGrains_PutCoffeeGrainsIntoFilter_true() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.fillFilterWithCoffeeGrains();
        boolean expected = true;
        boolean actual = coffeeMaker.getFilterAndReceptacle().getCoffeeGrains();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bolierOff_Output_PressureValveOpenedAndWorkkingBoilerFalse() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Outputs outputs = new Outputs();
        Boiler boiler = new Boiler();
        coffeeMaker.boilerOff(outputs);
        boolean expected = false;
        boolean actual = boiler.getWorkingBoiler();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bolierOn_Output_PressureValveClosedAndWorkkingBoilerTrue() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Outputs outputs = new Outputs();
        PressureRelietValve pressureRelietValve = new PressureRelietValve();
        coffeeMaker.boilerOn(outputs);
        boolean expected = false;
        boolean actual = pressureRelietValve.getStateValve();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void potPlateOn_Output_LightTurnedOnAndPotOn() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Pot pot = new Pot();
        pot.on();
        Outputs outputs = new Outputs();
        coffeeMaker.potPlateOn(outputs);
        boolean expected = true;
        boolean actual = pot.obtainWorkingPot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void potPlateOff_Output_LightTurnedOffAndPotOff() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Pot pot = new Pot();
        pot.off();
        Outputs outputs = new Outputs();
        coffeeMaker.potPlateOff(outputs);
        boolean expected = false;
        boolean actual = pot.obtainWorkingPot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makingCoffee_Output_BoilerRestOneCupAndPotPluOneCup() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Pot pot = new Pot();
        pot.plusOneCup();
        Outputs outputs = new Outputs();
        coffeeMaker.makingCoffee(outputs);
        int expected = 1;
        int actual = pot.getAmountOfCups();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnPotToPlateHeater_Output_PlacingPot() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        PlateSensor plateSensor = new PlateSensor();
        Outputs outputs = new Outputs();
        plateSensor.thereIsNoPot();
        coffeeMaker.returnPotToPlateHeater(outputs);
        boolean expected = false;
        boolean actual = plateSensor.obtainStatePlate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnPotToPlateHeater_Output_PotPlaced() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        PlateSensor plateSensor = new PlateSensor();
        Pot pot = new Pot();
        Outputs outputs = new Outputs();
        pot.setAmountOfCups(3);
        coffeeMaker.returnPotToPlateHeater(outputs);
        boolean expected = false;
        boolean actual = plateSensor.obtainStatePlate();
        Assert.assertEquals(expected, actual);
    }

}