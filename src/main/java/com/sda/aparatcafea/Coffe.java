package com.sda.aparatcafea;

public class Coffe {
    private ECoffeType type;

    public Coffe(ECoffeType type) {
        this.type = type;
    }

    public ECoffeType getCoffeType(){
        return type;
    }
}
