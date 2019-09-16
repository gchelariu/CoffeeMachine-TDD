package com.sda.aparatcafea;

public interface IAutomaticCoffeMachine {

    Coffe brew(ECoffeType type);

    void restock();

}
