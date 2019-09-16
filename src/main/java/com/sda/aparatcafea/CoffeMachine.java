package com.sda.aparatcafea;

public class CoffeMachine implements IAutomaticCoffeMachine {

    private int beans;
    private int water;
    private int milk;

    public CoffeMachine() {
        beans = 100;
        water = 1000;
        milk = 1000;
    }

    @Override
    public Coffe brew(ECoffeType type) {

        if (beans >= type.requiredBeans &&
                water >= type.requiredWater &&
                milk >= type.requiredMilk) {
            beans -= type.requiredBeans;
            water -= type.requiredWater;
            milk -= type.requiredMilk;
            return new Coffe(type);
        } else {

            String errorMessage = "Not enough";
            if (beans >= type.requiredBeans) {
                errorMessage += " beans ";
            }
            if (water >= type.requiredWater) {
                errorMessage += " water ";
            }
            if (milk >= type.requiredMilk) {
                errorMessage += " milk";
            }
            throw new IllegalArgumentException(errorMessage);
        }


    }

    @Override
    public void restock() {
        beans = 100;
        water = 1000;
        milk = 1000;
    }
}
