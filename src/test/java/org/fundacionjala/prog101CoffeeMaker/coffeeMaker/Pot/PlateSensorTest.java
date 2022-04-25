package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlateSensorTest {

    @Test
    public void checkState_One() {
        PlateSensor plateSensor = new PlateSensor();
        Pot pot = new Pot();
        plateSensor.thereIsAPot();
        pot.setAmountOfCups(1);
        int expected = 1;
        int actual = plateSensor.checkState(pot);
        assertEquals(expected, actual);
    }

    @Test
    public void checkState_Zero() {
        PlateSensor plateSensor = new PlateSensor();
        Pot pot = new Pot();
        plateSensor.thereIsAPot();
        pot.setAmountOfCups(0);
        int expected = 0;
        int actual = plateSensor.checkState(pot);
        assertEquals(expected, actual);
    }

    @Test
    public void checkState_Two() {
        PlateSensor plateSensor = new PlateSensor();
        Pot pot = new Pot();
        plateSensor.thereIsAPot();
        pot.setAmountOfCups(1);
        int expected = 1;
        int actual = plateSensor.checkState(pot);
        assertEquals(expected, actual);
    }

    @Test
    public void checkState_TwoToo() {
        PlateSensor plateSensor = new PlateSensor();
        Pot pot = new Pot();
        plateSensor.thereIsAnEmptyPot();
        pot.setAmountOfCups(2);
        int expected = 2;
        int actual = plateSensor.checkState(pot);
        assertEquals(expected, actual);
    }

    @Test
    public void obtainStatePlate_newStateFalse_False() {
        PlateSensor plateSensor = new PlateSensor();
        boolean newState = false;
        plateSensor.setState(newState);
        boolean expected = false;
        boolean actual = plateSensor.obtainStatePlate();
        assertEquals(expected, actual);
    }

    @Test
    public void obtainStatePlate_newStateTrue_True() {
        PlateSensor plateSensor = new PlateSensor();
        boolean newState = true;
        plateSensor.setState(newState);
        boolean expected = true;
        boolean actual = plateSensor.obtainStatePlate();
        assertEquals(expected, actual);
    }

    @Test
    public void obtainStatePlate_True() {
        PlateSensor plateSensor = new PlateSensor();
        plateSensor.thereIsAPot();
        boolean expected = true;
        boolean actual = plateSensor.obtainStatePlate();
        assertEquals(expected, actual);
    }

    @Test
    public void obtainStatePlate_False() {
        PlateSensor plateSensor = new PlateSensor();
        plateSensor.thereIsNoPot();
        boolean expected = false;
        boolean actual = plateSensor.obtainStatePlate();
        assertEquals(expected, actual);
    }

    @Test
    public void obtainStatePlate_FalseToo() {
        PlateSensor plateSensor = new PlateSensor();
        plateSensor.thereIsAnEmptyPot();
        boolean expected = false;
        boolean actual = plateSensor.obtainStatePlate();
        assertEquals(expected, actual);
    }
}