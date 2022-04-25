package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler.Boiler;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.DeliveryPipe;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.FilterAndReceptacle;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.IndicatorLight;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.StartButton;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.PlateSensor;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.Pot;

public class CoffeeMaker {
    private Boiler boiler;
    private PlateSensor plateSensor;
    private StartButton startButton;
    private IndicatorLight indicatorLight;
    private FilterAndReceptacle filterAndReceptacle;
    private Pot pot;
    private DeliveryPipe deliveryPipe;

    public CoffeeMaker() {
        boiler = new Boiler();
        plateSensor = new PlateSensor();
        startButton = new StartButton();
        indicatorLight = new IndicatorLight();
        filterAndReceptacle = new FilterAndReceptacle();
        pot = new Pot();
        deliveryPipe = new DeliveryPipe();
    }

    /**
     * Init boiler
     * @return
     */
    public void boilerOn(final Outputs outputs) {
        outputs.print(outputs.formatColorYellow("Boiler is on"));
        boiler.on();
    }
    /**
     * Off boiler
     * @return
     */
    public void boilerOff(final Outputs outputs) {
        outputs.print(outputs.formatColorYellow("Boiler is off"));
        boiler.off();
    }
    /**
     * Init Plate pot
     * @return
     */
    public void potPlateOn(final Outputs outputs) {
        outputs.print(outputs.formatColorGreen("PlateHeater and light pot are on"));
        indicatorLight.turnOn();
        pot.on();
    }
    /**
     * Off Plate pot
     * @return
     */
    public void potPlateOff(final Outputs outputs) {
        outputs.print(outputs.formatColorYellow("PlateHeater and light pot is off"));
        indicatorLight.turnOff();
        pot.off();
    }
    /**
     * Returns the state of the startButton
     * @return boolean
     */
    public boolean obtainsStartButtonState() {
        return startButton.getButtonPressed();
    }
    /**
     * Return the pot to it's place on the plateSensor
     */
    public boolean returnPotToPlateHeater(final Outputs outputs) {
        if (plateSensor.checkState(pot) == 2) {
            outputs.print(outputs.formatColorGreen("Placing the pot ..."));
            plateSensor.thereIsAPot();
            outputs.print(outputs.formatColorGreen("The pot is ready"));
            return true;
        } else {
            outputs.print(outputs.formatColorYellow("The pot is already in place"));
            return false;
        }
    }

    /**
     * Return the pot to it's place on the plateSensor
     */
    public boolean removePotToPlateHeater(final Outputs outputs) {
        if (plateSensor.checkState(pot) == 0 || plateSensor.checkState(pot) == 1) {
            outputs.print(outputs.formatColorGreen("Removing the pot ..."));
            plateSensor.thereIsNoPot();
            outputs.print(outputs.formatColorGreen("The pot is removed"));
            return true;
        } else {
            outputs.print(outputs.formatColorYellow("The pot is not longer on the sensor plate"));
            return false;
        }
    }

    /**
     * Returns true if the filter contains coffee grains
     * @return boolean
     * making coffee
     */
    public void makingCoffee(final Outputs outputs) {
        boiler.restOneCup();
        pot.plusOneCup();
        outputs.print("Ready " + pot.getAmountOfCups() + " cup(s) of coffee");
    }

    /**
     * drink only one cup of coffee
     */
    public boolean drinkOneCupCoffee(final Outputs outputs) {
        pot.restOneCup();
        outputs.print("Drink Coffee...!!! - Remain " + pot.getAmountOfCups() + " cup(s) of coffee");
        if (pot.getAmountOfCups() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Added water in CoffeeMaker
     */
    public boolean loadWater(final Outputs outputs, final int cupsWater) {
        if (!isBoilerWithWater()) {
            outputs.print(outputs.formatColorGreen("Adding water..."));
            fillBoilerWithWater(cupsWater);
            outputs.print(outputs.formatColorGreen("The water is ready"));
            return true;
        } else {
            outputs.print(outputs.formatColorYellow("No more water can be inserted"));
            return false;
        }
    }

    /**
     * Added coffee in CoffeeMaker
     */
    public boolean loadCoffeeBeans(final Outputs outputs) {
        if (!isFilterWithCoffeeBeans()) {
            outputs.print(outputs.formatColorGreen("Adding coffee to the coffee filter..."));
            fillFilterWithCoffeeGrains();
            outputs.print(outputs.formatColorGreen("The coffee is ready"));
        return true;
        } else {
            outputs.print(outputs.formatColorYellow("No more coffee can be inserted"));
            return false;
        }
    }

    /**
     * Verify if there is water and coffee in the coffee maker, if there is, start the coffee process
     */
    public void initCoffeeMaker(final Outputs outputs) {
        if (verifyConditionsForCoffeeMaker()) {
            pressStartButton();
        } else {
            if (!isBoilerWithWater()) {
                outputs.print(outputs.formatError("There is no water on the boiler"));
            }
            if (!isFilterWithCoffeeBeans()) {
                outputs.print(outputs.formatError("There is no coffee beans on the filter"));
            }
            if (!(checkPlacePot() == 0 || checkPlacePot() == 1)) {
                outputs.print(outputs.formatError("There is no pot on the sensor plate"));
            }
        }
    }
    /**
     * Verifies if the conditions to start making coffee have been met
     */
    public boolean verifyConditionsForCoffeeMaker() {
        boolean hasWater = isBoilerWithWater();
        boolean hasCoffeeBeans = isFilterWithCoffeeBeans();
        boolean hasPot = checkPlacePot() == 0 || checkPlacePot() == 1;
        return  hasWater && hasCoffeeBeans && hasPot;
    }

    /**
     * A
     * @return
     */
    public boolean isFilterWithCoffeeBeans() {
        return filterAndReceptacle.getCoffeeGrains();
    }

    /**
     * Returns true if the boiler contains water
     * @return boolean
     */
    public boolean isBoilerWithWater() {
        return boiler.containLiquid();
    }

    /**
     * Gets the boiler
     * @return Boiler
     */
    public Boiler getBoiler() {
        return boiler;
    }

    /**
     * Gets the filter and receptacle
     * @return FilterAndReceptacle
     */
    public FilterAndReceptacle getFilterAndReceptacle() {
        return filterAndReceptacle;
    }

    /**
     * Fills the boiler with cups of water
     */
    public void fillBoilerWithWater(final int cupsWater) {
        boiler.setCupsOfWater(cupsWater);
    }

    /**
     * Fills the filter with coffee grains
     */
    public void fillFilterWithCoffeeGrains() {
        filterAndReceptacle.putCoffeeGrains();
    }



    /**
     * Changes the state of the startButton
     */
    public void pressStartButton() {
        startButton.pressed();
    }

    /**
     * Returns true if the pot is it's place
     * @return boolean
     */
    public int checkPlacePot() {
        return plateSensor.checkState(pot);
    }

    /**
     * Removes the pot from the plateSensor
     */
    public void removePot() {
        plateSensor.setState(false);
    }

}
