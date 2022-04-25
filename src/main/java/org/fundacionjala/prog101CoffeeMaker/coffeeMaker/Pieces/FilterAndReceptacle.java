package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces;

public class FilterAndReceptacle {
    private boolean coffeeGrains;

    /**
     * Sets coffee grains in the filter, so changes the coffeeGrains to True
     * @return boolean
     */
    public void putCoffeeGrains() {
        coffeeGrains = true;
    }

    /**
     * Return the state of the coffee grains
     * @return boolean
     */
    public boolean getCoffeeGrains() {
        return coffeeGrains;
    }

}
