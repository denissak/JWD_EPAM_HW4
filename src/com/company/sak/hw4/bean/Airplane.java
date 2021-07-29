package com.company.sak.hw4.bean;

import java.util.Objects;

public abstract class Airplane {

    private final String model;
    private final double length;
    private final double height;
    private final double weight;
    private final double fuelCapacity;

    public Airplane(String model, double length, double height, double weight, double fuelCapacity) {
        this.model = model;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
    }

    public String getModel() {
        return model;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return Double.compare(airplane.length, length) == 0 &&
                Double.compare(airplane.height, height) == 0 &&
                Double.compare(airplane.weight, weight) == 0 &&
                Double.compare(airplane.fuelCapacity, fuelCapacity) == 0 &&
                model.equals(airplane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, length, height, weight, fuelCapacity);
    }
}


