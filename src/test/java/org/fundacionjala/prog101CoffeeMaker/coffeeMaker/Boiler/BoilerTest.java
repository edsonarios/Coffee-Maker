package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

import org.junit.Assert;
import org.junit.Test;

public class BoilerTest {

    @Test
    public void containLiquid_ThereIsNoLiquid_False() {
        Boiler boiler = new Boiler();
        boolean expected = false;
        boolean actual = boiler.containLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_ThereIsOneCoupOfLiquid_True() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(1);
        boolean expected = true;
        boolean actual = boiler.containLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_ThereIsTwelveCoupsOfLiquid_True() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(12);
        boolean expected = true;
        boolean actual = boiler.containLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_RestCoups_Eleven() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(12);
        boiler.restOneCup();
        int expected = 11;
        int actual = boiler.amountOfLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_RestCoupsUntilZeroCoups_Zero() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(12);
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        boiler.restOneCup();
        int expected = 0;
        int actual = boiler.amountOfLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void on_HeaterOn_True() {
        Boiler boiler = new Boiler();
        final int waterCups = 12;
        boiler.setCupsOfWater(waterCups);
        boiler.on();
        boolean expected = true;
        boolean actual = boiler.getWorkingBoiler();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void off_HeaterOff_False() {
        Boiler boiler = new Boiler();
        boiler.off();
        boolean expected = false;
        boolean actual = boiler.getWorkingBoiler();
        Assert.assertEquals(expected, actual);
    }
}