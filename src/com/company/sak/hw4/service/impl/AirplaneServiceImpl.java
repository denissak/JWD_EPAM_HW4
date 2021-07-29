package com.company.sak.hw4.service.impl;

import com.company.sak.hw4.bean.Airline;
import com.company.sak.hw4.bean.cargo.Airfreighter;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;
import com.company.sak.hw4.service.AirplaneService;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {

    Airline airline = new Airline();

    @Override
    public double calculateLiftingCapacity() {
        double totalLiftingCapacity = 0;
        Iterator<Airfreighter> airfreighterIterator = airline.airfreighterIterator();
        while (airfreighterIterator.hasNext()) {
            totalLiftingCapacity += airfreighterIterator.next().getLiftingСapacity();
        }
        return totalLiftingCapacity;
    }

    @Override
    public double calculateCargoCapacity() {
        double totalCargoCapacity = 0;
        Iterator<Airfreighter> airfreighterIterator = airline.airfreighterIterator();
        while (airfreighterIterator.hasNext()) {
            totalCargoCapacity += airfreighterIterator.next().getCargoCapacity();
        }
        return totalCargoCapacity;
    }

    @Override
    public double calculatePassengerCapacity() {
        double totalPassengerCapacity = 0;
        Iterator<PassengerAirplane> passengerAirplaneIterator = airline.passengerAirplaneIterator();
        while (passengerAirplaneIterator.hasNext()) {
            totalPassengerCapacity += passengerAirplaneIterator.next().getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }

    @Override
    public void sort(List airplanes, Comparator comparator) {

    }

}

