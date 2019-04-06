package com.itacademy.inheritance;

public class Yamaha extends Motorbike {

    public Yamaha(String color) {
        super(color, 300);
        System.out.println("Creating " + color + " Yamaha");
    }

}
