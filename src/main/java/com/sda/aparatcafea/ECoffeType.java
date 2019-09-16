package com.sda.aparatcafea;

public enum ECoffeType {
    ESPRESSO(7, 150, 0),
    CAPPUCCINO(7, 200, 50);

    public final int requiredBeans;
    public final int requiredWater;
    public final int requiredMilk;

    ECoffeType(int requiredBeans, int requiredWater, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredWater = requiredWater;
        this.requiredMilk = requiredMilk;
    }
}
