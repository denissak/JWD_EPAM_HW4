package com.company.sak.hw4.bean.passenger;

import com.company.sak.hw4.bean.Airplane;

import java.util.EnumSet;

public class PassengerAirplane extends Airplane {

    private EnumSet<ModelPassengerAirplane> modelPassengerAirplanes;
    private final int passengerCapacity;

    public PassengerAirplane(EnumSet<ModelPassengerAirplane> modelPassengerAirplanes, double length, double height, double weight, double fuelCapacity, int passengerCapacity) {
        super(length, height, weight, fuelCapacity);
        this.modelPassengerAirplanes = modelPassengerAirplanes;
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public EnumSet<ModelPassengerAirplane> getModelPassengerAirplanes() {
        return modelPassengerAirplanes;
    }

    public void setModelPassengerAirplanes(EnumSet<ModelPassengerAirplane> modelPassengerAirplanes) {
        this.modelPassengerAirplanes = modelPassengerAirplanes;
    }
}
