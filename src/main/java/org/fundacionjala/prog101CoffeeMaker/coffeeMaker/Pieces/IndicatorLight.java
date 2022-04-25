package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces;

public class IndicatorLight {
    private boolean lightState;

    /**
     * Turns on the light
     */
    public void turnOn() {
        lightState = true;
    }

    /**
     * Turns off the light
     */
    public void turnOff() {
        lightState = false;
    }

    /**
     * Gets the state of the light
     */
    public boolean getLightState() {
        return lightState;
    }

    /**
     * Sets the state of the light
     */
    public void setLightState(final boolean newLightState) {
        this.lightState = newLightState;
    }
}
