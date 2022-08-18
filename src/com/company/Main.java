package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Sedan("Mercedes", "Red", 280);
        car.gas();
        car.brake();

        Car car1 = new Sedan("Opel", "Green", 220);
        car1.gas();
        car1.brake();


        Car car2 = new Miniven("Step", "Black", 240);
        car2.gas();
        car2.brake();


    }
}
