package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

public class PressureRelietValve {
    private boolean stateValve;

    /**
     * Opens the valve changing the state of stateValve to true
     */
    public void open() {
        stateValve = true;
    }

    /**
     * Closes the valve changing the state of stateValve to false
     */
    public void close() {
        stateValve = false;
    }

    /**
     * Return the state valve
     * @return stateValve
     */
    public boolean getStateValve() {
        return stateValve;
    }

    /**
     *
     * @param newStateValve
     */
    public void setStateValve(final boolean newStateValve) {
        this.stateValve = newStateValve;
    }
}
