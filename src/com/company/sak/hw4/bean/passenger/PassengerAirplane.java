package com.company.sak.hw4.bean.passenger;

import com.company.sak.hw4.bean.Airplane;

import java.util.Objects;

public class PassengerAirplane extends Airplane {

    private final int passengerCapacity;

    public PassengerAirplane(String model, double length, double height, double weight, double fuelCapacity, int passengerCapacity) {
        super(model, length, height, weight, fuelCapacity);
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerAirplane that = (PassengerAirplane) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PassengerAirplane");
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
        sb.append(", passengerCapacity");
        sb.append(getPassengerCapacity());
        return sb.toString();
    }
}
