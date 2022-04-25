package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;
import java.util.TimerTask;
import java.util.Timer;

public class ControllerCoffeeMaker {
    private CoffeeMaker coffeeMaker;
    private Inputs inputs;
    private Outputs outputs;
    private Timer timer;
    private final int velocityCoffeeMaker = 100;
    private final int delayOfCycleInMilliSeconds = 10;
    private final int numberHundred = 100;
    private int tic;

    private final int intermittencePlateHeater = 14;
    private int counterPlateHeater = 0;
    private boolean coffeeFinish = false;
    private boolean switchPlateHeater = true;

    private final int intermittenceDrinkCoffee = 14;

    public ControllerCoffeeMaker() {
        coffeeMaker = new CoffeeMaker();
        inputs = new Inputs();
        outputs = new Outputs();
    }

    /**
     * Initialize the Coffee Maker
     */
    public void initialize() {
        outputs.print(outputs.printHead());
        while (!coffeeMaker.obtainsStartButtonState()) {
            outputs.print(outputs.instructions());
            entryOption(inputs.scanner());
            outputs.print("");
        }
        outputs.print(outputs.formatColorGreen("Starting coffee..."));
        timer = new Timer();
        startCoffeeMaker();
    }

    /**
     * make coffee each time
     */
    public void startCoffeeMaker() {
        coffeeMaker.boilerOn(outputs);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (tic % velocityCoffeeMaker == 0) {
                    makingCoffeeMaker();
                    intermittencePlateHeater();
                    tic /= numberHundred;
                }

                tic += 1;
            }
        };
        timer.scheduleAtFixedRate(task, 0, delayOfCycleInMilliSeconds);
    }

    /**
     * Selected any option available
     * @param option
     */
    public void entryOption(final String option) {
        final int cupsWater = 12;
        switch (option) {
            case "1":
                initCoffeeMaker();
                break;
            case "2":
                loadWater(cupsWater);
                break;
            case "3":
                loadCoffeeBeans();
                break;
            case "4":
                loadPotOverHeaterPlatePot();
                break;
            case "5":
                removePotOverPlateHeater();
                break;
            case "6":
                outputs.print(outputs.formatColorGreen("Selected option 4, bye...!!!"));
                exit();
                break;
            default:
                outputs.print(outputs.formatError("Option not available, choose one of the given above"));
                break;
        }
    }

    /**
     * Making Coffee
     */
    public void makingCoffeeMaker() {
        if (coffeeMaker.verifyConditionsForCoffeeMaker()) {
            if (coffeeMaker.checkPlacePot() == 0 || coffeeMaker.checkPlacePot() == 1) {
                coffeeMaker.makingCoffee(outputs);
            } else {
                outputs.print("pause...");
                coffeeMaker.boilerOff(outputs);
                coffeeMaker.potPlateOff(outputs);
            }
        } else {
            if (!coffeeFinish) {
                outputs.print(outputs.formatColorGreen("The coffee is ready...!!!"));
                coffeeFinish = true;
                coffeeMaker.boilerOff(outputs);
            }
        }
    }

    /**
     * Intermittence the Plate Heater
     */
    public void intermittencePlateHeater() {
        counterPlateHeater++;
        if (counterPlateHeater == intermittencePlateHeater) {
            if (switchPlateHeater) {
                coffeeMaker.potPlateOn(outputs);
                switchPlateHeater = false;
            } else {
                switchPlateHeater = true;
                if (!coffeeMaker.drinkOneCupCoffee(outputs)) {
                    outputs.print(outputs.formatColorGreen("CoffeeMaker is finish"));
                    exit();
                }
                coffeeMaker.potPlateOff(outputs);
            }
            counterPlateHeater = 0;
        }
    }
    /**
     * Remove the pot from the sensor, checking if it has already been removed
     */
    public boolean removePotOverPlateHeater() {
        outputs.print(outputs.formatColorGreen("Selected option 5"));
        if (coffeeMaker.removePotToPlateHeater(outputs)) {
            return true;
        }
        return false;
    }
    /**
     * Returns the pot on the sensor plate, checking if it has already been returned.
     */
    public boolean loadPotOverHeaterPlatePot() {
        outputs.print(outputs.formatColorGreen("Selected option 4"));
        if (coffeeMaker.returnPotToPlateHeater(outputs)) {
            return true;
        }
        return false;
    }
    /**
     * Verify if there is water and coffee in the coffee maker, if there is, start the coffee process
     */
    public void initCoffeeMaker() {
        outputs.print(outputs.formatColorGreen("Selected option 1"));
        coffeeMaker.initCoffeeMaker(outputs);
    }

    /**
     * Added water in CoffeeMaker
     */
    public boolean loadWater(final int cupsWater) {
        outputs.print(outputs.formatColorGreen("Selected option 2"));
        if (coffeeMaker.loadWater(outputs, cupsWater)) {
            return true;
        }
        return false;
    }

    /**
     * Added coffee in CoffeeMaker
     */
    public boolean loadCoffeeBeans() {
        outputs.print(outputs.formatColorGreen("Selected option 3"));
        if (coffeeMaker.loadCoffeeBeans(outputs)) {
            return true;
        }
        return false;
    }
    /**
     * Verify conditions for coffee maker
     */
    public boolean verifyConditionsForCoffeeMaker() {
        return coffeeMaker.verifyConditionsForCoffeeMaker();
    }

    /**
     * Send the message for graphical interface
     * @return
     */
    public String printForInterface() {
        String message = outputs.printForInterface();
        outputs.eraseStringForInterface();
        return message;
    }

    /**
     * close all program
     */
    public void exit() {
        System.exit(0);
    }
}
