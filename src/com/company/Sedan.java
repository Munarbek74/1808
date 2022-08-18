package com.company;

public class Sedan extends Car{

    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println(getModel() + " Газ менен да журот");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " Тормозу жакшы кармайт");
    }
}
