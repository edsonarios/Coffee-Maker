package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilterAndReceptacleTest {

    @Test
    public void putCoffeeGrains_CoffeeGrains_True() {
        FilterAndReceptacle filterAndReceptacle = new FilterAndReceptacle();
        boolean expected = true;
        filterAndReceptacle.putCoffeeGrains();
        boolean actual = filterAndReceptacle.getCoffeeGrains();
        assertEquals(expected, actual);
    }

    @Test
    public void getCoffeeGrains_CoffeeGrains_False() {
        FilterAndReceptacle filterAndReceptacle = new FilterAndReceptacle();
        boolean expected = false;
        boolean actual = filterAndReceptacle.getCoffeeGrains();
        assertEquals(expected, actual);
    }
}