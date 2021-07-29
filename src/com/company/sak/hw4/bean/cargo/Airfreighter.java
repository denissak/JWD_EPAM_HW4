package com.company.sak.hw4.bean.cargo;

import com.company.sak.hw4.bean.Airplane;

import java.util.Objects;

public class Airfreighter extends Airplane {

    private double liftingСapacity;
    private double cargoCapacity;

    public Airfreighter(String model, double length, double height, double weight, double fuelCapacity, double liftingСapacity, double cargoCapacity) {
        super(model, length, height, weight, fuelCapacity);
        this.liftingСapacity = liftingСapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public double getLiftingСapacity() {
        return liftingСapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Airfreighter that = (Airfreighter) o;
        return Double.compare(that.liftingСapacity, liftingСapacity) == 0 &&
                Double.compare(that.cargoCapacity, cargoCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingСapacity, cargoCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airfreighter");
        sb.append(", model=");
        sb.append(getModel());
        sb.append(", length");
        sb.append(getLength());
        sb.append(", height");
        sb.append(getHeight());
        sb.append(", weight");
        sb.append(getWeight());
        sb.append(", fuelCapacity");
        sb.append(getFuelCapacity());
        sb.append(", liftingCapacity");
        sb.append(getLiftingСapacity());
        sb.append(", cargoCapacity");
        sb.append(getCargoCapacity());
        return sb.toString();
    }
}
