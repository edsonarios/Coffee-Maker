package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

import org.junit.Assert;
import org.junit.Test;

public class PressureRelietValveTest {

    @Test
    public void open_ValveOpen_True() {
        PressureRelietValve pressureRelietValve = new PressureRelietValve();
        pressureRelietValve.open();
        boolean expected = true;
        boolean actual = pressureRelietValve.getStateValve();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void close_ValveClose_False() {
        PressureRelietValve pressureRelietValve = new PressureRelietValve();
        pressureRelietValve.close();
        boolean expected = false;
        boolean actual = pressureRelietValve.getStateValve();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStateValve_True() {
        PressureRelietValve pressureRelietValve = new PressureRelietValve();
        pressureRelietValve.setStateValve(true);
        boolean expected = true;
        boolean actual = pressureRelietValve.getStateValve();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStateValve_False() {
        PressureRelietValve pressureRelietValve = new PressureRelietValve();
        pressureRelietValve.setStateValve(false);
        boolean expected = false;
        boolean actual = pressureRelietValve.getStateValve();
        Assert.assertEquals(expected, actual);
    }
}