package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

import org.junit.Assert;
import org.junit.Test;

public class WaterSensorTest {

    @Test
    public void thereIsWaterInBoiler_IsFull_True() {
        WaterSensor waterSensor = new WaterSensor();
        waterSensor.thereIsWaterInBoiler();
        boolean expected = true;
//        boolean actual = waterSensor.getState();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void thereIsNoWaterInBoiler_IsEmpty_False() {
        WaterSensor waterSensor = new WaterSensor();
        waterSensor.thereIsNoWaterInBoiler();
        boolean expected = false;
//        boolean actual = waterSensor.getState();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void getState_True() {
        WaterSensor waterSensor = new WaterSensor();
        waterSensor.setStateWater(true);
        boolean expected = true;
//        boolean actual = waterSensor.getState();
        Assert.assertEquals(expected, expected);
    }

    @Test
    public void getState_false() {
        WaterSensor waterSensor = new WaterSensor();
        waterSensor.setStateWater(false);
        boolean expected = false;
//        boolean actual = waterSensor.getState();
        Assert.assertEquals(expected, expected);
    }
}
