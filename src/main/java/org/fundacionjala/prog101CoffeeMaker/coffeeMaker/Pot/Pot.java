package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Container;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Heater;

public class Pot implements Container, Heater {
    private boolean containsLiquid = false;
    private int amountOfCups = 0;
    private boolean workingPot;

    /**
     * Returns the state of the container
     *
     * @return boolean
     */
    @Override
    public boolean containLiquid() {
        return containsLiquid;
    }

    /**
     * amount coffee
     * @return
     */
    @Override
    public int amountOfLiquid() {
        return amountOfCups;
    }

    /**
     * Pot on
     * @return
     */
    @Override
    public void on() {
        workingPot = true;
    }

    /**
     * Pot off
     */
    @Override
    public void off() {
        workingPot = false;
    }

    /**
     * obtain the state the pot is it is working or not
     * @return boolean
     */
    public boolean obtainWorkingPot() {
        return  workingPot;
    }

    /**
     * Gets the place where is the pot
     *
     * @return boolean
     */
    public int getAmountOfCups() {
        return amountOfCups;
    }

    /**
     * Changes the amount of cups
     */
    public void setAmountOfCups(final int newAmountOfCups) {
        this.amountOfCups = newAmountOfCups;
    }

    /**
     * Plus one cup of coffee
     */
    public void plusOneCup() {
        this.amountOfCups++;
        containsLiquid = true;
    }

    /**
     * Plus one cup of coffee
     */
    public void restOneCup() {
        this.amountOfCups--;
        if (amountOfCups == 0) {
            containsLiquid = false;
        }
    }

}
