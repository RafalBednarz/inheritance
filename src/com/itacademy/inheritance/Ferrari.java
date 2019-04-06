package com.itacademy.inheritance;

public class Ferrari extends Car {

    public Ferrari(String color) {
        super(color, 300);
        System.out.println("Creating " + color + " Ferrari");
    }

    @Override
    public void drive() {
        System.out.println("Hello I'm Ferrari, I'm overriden version of drive() method " +
                "and I'm driving with max speed of " +  getMaxSpeed() + " km/h");
    }
}
