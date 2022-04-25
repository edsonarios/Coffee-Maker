package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces;

public class DeliveryPipe {
    private boolean deliveryWarmWater = true;

    /**
     * Gets the state of the delivery pipe
     * @return boolean
     */
    public boolean getDeliveryWarmWater() {
        return deliveryWarmWater;
    }

    /**
     * Changes the state of the delivery pipe
     */
    public void setDeliveryWarmWater(final boolean deliveryPipe) {
        this.deliveryWarmWater = deliveryPipe;
    }
}
