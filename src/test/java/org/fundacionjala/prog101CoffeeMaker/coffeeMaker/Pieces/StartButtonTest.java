package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartButtonTest {

    @Test
    public void isPressed_True() {
        StartButton button = new StartButton();
        boolean expected = true;
        button.pressed();
        boolean actual = button.getButtonPressed();
        assertEquals(expected, actual);
    }

    @Test
    public void getButtonPressed_ButtonPressed() {
        StartButton button = new StartButton();
        boolean expected = false;
        boolean actual = button.getButtonPressed();
        assertEquals(expected, actual);
    }

    @Test
    public void setButtonState_NewButtonStateTrue_True() {
        StartButton button = new StartButton();
        boolean newState = true;
        boolean expected = true;
        button.setButtonState(newState);
        boolean actual = button.getButtonPressed();
        assertEquals(expected, actual);
    }
}