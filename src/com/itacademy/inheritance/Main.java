package com.itacademy.inheritance;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Polonez("white");
        car.drive();

        Vehicle ferrari = new Ferrari("red");
        ferrari.drive();
        System.out.println("There was " + Vehicle.getVehiclesProduced() + " vehicles produced.");
    }
}
