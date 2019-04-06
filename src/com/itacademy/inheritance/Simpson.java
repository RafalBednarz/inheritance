package com.itacademy.inheritance;

public class Simpson extends Motorbike {
    public Simpson(String color) {
        super(color, 80);
        System.out.println("Creating " + color + " Simpson");
    }

    @Override
    public void drive() {
        System.out.println("I'm driving " +  getMaxSpeed() + " km/h");
    }
}
