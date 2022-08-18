package com.company;

public class Sedan extends Car{

    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Газ менен да журот");
    }

    @Override
    public void brake() {
        System.out.println("Тормозу жакшы кармайт");
    }
}
