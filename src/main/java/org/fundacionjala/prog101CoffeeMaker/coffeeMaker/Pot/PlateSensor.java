package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Container;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Sensor;

public class PlateSensor implements Sensor {
    private boolean statePlate = false;

    /**
     * Returns the state of plateSensor
     * @return boolean
     */
    @Override
    public int checkState(final Container container) {
        Pot pot = (Pot) container;
        if (pot.getAmountOfCups() > 0 && statePlate) {
            return 1;
        } else {
            if (pot.getAmountOfCups() == 0 && statePlate) {
                return 0;
            } else {
                return 2;
            }
        }
    }

    /**
     * Sets the state of plateSensor
     */
    public void setState(final boolean newStatePlate) {
        this.statePlate = newStatePlate;
    }

    /**
     * Changes the state of the statePlate to True
     */
    public void thereIsAPot() {
        statePlate = true;
    }

    /**
     * Changes the state of the statePlate to False
     */
    public void thereIsNoPot() {
        statePlate = false;
    }

    /**
     * Changes the state of the statePlate to False
     */
    public void thereIsAnEmptyPot() {
        statePlate = false;
    }

    /**
     * Obtain the state of plate
     * @return boolean
     */
    public boolean obtainStatePlate() {
        return statePlate;
    }

}
