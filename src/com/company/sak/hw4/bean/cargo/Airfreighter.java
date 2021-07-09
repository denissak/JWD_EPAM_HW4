package com.company.sak.hw4.bean.cargo;

import com.company.sak.hw4.bean.Airplane;

import java.util.EnumSet;

public class Airfreighter extends Airplane {

    private double liftingСapacity;
    private double cargoCapacity;
    private EnumSet<ModelAirfreighter> modelAirfreighters;


    public Airfreighter(EnumSet<ModelAirfreighter> modelAirfreighters, double length, double height, double weight, double fuelCapacity, double liftingСapacity, double cargoCapacity) {
        super(length, height, weight, fuelCapacity);
        this.modelAirfreighters = modelAirfreighters;
        this.liftingСapacity = liftingСapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public double getLiftingСapacity() {
        return liftingСapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public EnumSet<ModelAirfreighter> getModelAirfreighters() {
        return modelAirfreighters;
    }

    public void setModelAirfreighters(EnumSet<ModelAirfreighter> modelAirfreighters) {
        this.modelAirfreighters = modelAirfreighters;
    }
}
