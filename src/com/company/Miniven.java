package com.company;

public class Miniven extends Car{

    public Miniven(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Газ менен жакшы тартпайт");
    }

    @Override
    public void brake() {
        System.out.println("Тормоз тепкенде добуш чыгат");
    }
}
