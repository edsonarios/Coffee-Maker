package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotTest {

    @Test
    public void containLiquid_False() {
        Pot pot = new Pot();
        boolean expected = false;
        boolean actual = pot.containLiquid();
        assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_RestCoups_Eleven() {
        Pot pot = new Pot();
        pot.setAmountOfCups(12);
        pot.restOneCup();
        int expected = 11;
        int actual = pot.amountOfLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_RestCoupsUntilZeroCoups_Zero() {
        Pot pot = new Pot();
        pot.setAmountOfCups(12);
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        pot.restOneCup();
        int expected = 0;
        int actual = pot.amountOfLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountOfLiquid_Zero() {
        Pot pot = new Pot();
        int expected = 0;
        int actual = pot.amountOfLiquid();
        assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfCups_AmountOfCups() {
        Pot pot = new Pot();
        int expected = 0;
        int actual = pot.getAmountOfCups();
        assertEquals(expected, actual);
    }

    @Test
    public void setAmountOfCups_NewAmountFive_Five() {
        int newAmount = 5;
        Pot pot = new Pot();
        pot.setAmountOfCups(newAmount);
        int expected = 5;
        int actual = pot.getAmountOfCups();
        assertEquals(expected, actual);
    }

    @Test
    public void plusOneCup() {
        Pot pot = new Pot();
        pot.plusOneCup();
        boolean expected = true;
        boolean actual = pot.containLiquid();
        assertEquals(expected, actual);
    }

    @Test
    public void restOneCup() {
        Pot pot = new Pot();
        pot.restOneCup();
        boolean expected = false;
        boolean actual = pot.containLiquid();
        assertEquals(expected, actual);
    }



    @Test
    public void obtainWorkingPot_true() {
        Pot pot = new Pot();
        pot.on();
        boolean expected = true;
        boolean actual = pot.obtainWorkingPot();
        assertEquals(expected, actual);
    }

    @Test
    public void obtainWorkingPot_false() {
        Pot pot = new Pot();
        pot.off();
        boolean expected = false;
        boolean actual = pot.obtainWorkingPot();
        assertEquals(expected, actual);
    }

}