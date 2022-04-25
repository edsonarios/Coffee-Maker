package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Container;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Heater;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.Pot;

public class Boiler implements Container, Heater {

    private PressureRelietValve pressureRelietValve;
    private WaterSensor waterSensor;
    private boolean workingBoiler;
    private int cupsOfWater;
    private Pot pot;
    public Boiler() {
        pressureRelietValve = new PressureRelietValve();
        waterSensor = new WaterSensor();
        this.cupsOfWater = 0;
        pot = new Pot();
    }

    /**
     * Returns true if the boiler contains liquid, otherwise false.
     * @return boolean
     */
    @Override
    public boolean containLiquid() {
        if (waterSensor.checkState(pot) == 1) {
            return true;
        }
        return false;
    }

    /**
     * amount
     * @return
     */
    @Override
    public int amountOfLiquid() {
        return cupsOfWater;
    }

    /**
     * Changes workingBoiler to true and the state pressure Reliet Valve to close.
     */
    @Override
    public void on() {
        pressureRelietValve.close();
        workingBoiler = true;
    }

    /**
     * Changes workingBoiler to false and pressure relieet valve open.
     */
    @Override
    public void off() {
        pressureRelietValve.open();
        workingBoiler = false;
    }

    /**
     * remove one coup of cafe
     */
    public void restOneCup() {
        this.cupsOfWater--;
        if (this.cupsOfWater == 0) {
            waterSensor.thereIsNoWaterInBoiler();
        }
    }

    /**
     * sets new capacity in coups of water.
     * @param newCupsOfWater
     */
    public void setCupsOfWater(final int newCupsOfWater) {
        this.cupsOfWater = newCupsOfWater;
        waterSensor.thereIsWaterInBoiler();
    }

    /**
     * obtains if Boiler is working or it's not working
     * @return workingBoiler
     */
    public boolean getWorkingBoiler() {
        return workingBoiler;
    }
}
