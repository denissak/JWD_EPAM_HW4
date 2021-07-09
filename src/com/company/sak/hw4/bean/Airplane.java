package com.company.sak.hw4.bean;

import java.util.EnumSet;

public abstract class Airplane {

    private final double length;
    private final double height;
    private final double weight;
    private final double fuelCapacity;

    public Airplane(double length, double height, double weight, double fuelCapacity) {
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
    }


    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }
}
