package com.itacademy.inheritance;

public abstract class Vehicle {
    private static int vehiclesProduced;
    private final int numberOfWheels;
    private final int maxSpeed;
    private String color;

    public Vehicle(int numberOfWheels, String color, int maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.maxSpeed = maxSpeed;
        vehiclesProduced++;
    }

    public static int getVehiclesProduced() {
        return vehiclesProduced;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void drive() {
        System.out.println("I'm " + this.getClass().getSimpleName() +
                " I'm driving with max speed of " + getMaxSpeed() + " km/h");
    }

    ;
}
