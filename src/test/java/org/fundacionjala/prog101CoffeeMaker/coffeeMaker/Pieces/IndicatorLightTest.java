package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class IndicatorLightTest {

    @Test
    public void turnOn_LightState_True() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean expected = true;
        indicatorLight.turnOn();
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }

    @Test
    public void turnOff_LightState_False() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean expected = false;
        indicatorLight.turnOff();
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }

    @Test
    public void getLight_LightState_False() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean expected = false;
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }

    @Test
    public void setLight_NewLightState_True() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean newState = true;
        boolean expected = true;
        indicatorLight.setLightState(newState);
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }
}