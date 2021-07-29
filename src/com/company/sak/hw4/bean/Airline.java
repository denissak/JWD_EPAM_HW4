package com.company.sak.hw4.bean;

import com.company.sak.hw4.bean.cargo.Airfreighter;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Airline {

    private Set<PassengerAirplane> passengerAirplaneSet;
    private Set<Airfreighter> airfreighterSet;

    public boolean addPassengerAirplane(PassengerAirplane passengerAirplane) {
        return passengerAirplaneSet.add(passengerAirplane);
    }

    public boolean addAirfreighter(Airfreighter airfreighter) {
        return airfreighterSet.add(airfreighter);
    }

    public boolean removePassengerAirplane(PassengerAirplane passengerAirplane) {
        if (passengerAirplane == null) {
            return false;
        }
        return passengerAirplaneSet.remove(passengerAirplane);
    }

    public boolean removeAirfreighter(Airfreighter airfreighter) {
        if (airfreighter == null) {
            return false;
        }
        return airfreighterSet.remove(airfreighter);
    }

    public Iterator<PassengerAirplane> passengerAirplaneIterator() {
        return passengerAirplaneSet.iterator();
    }

    public Iterator<Airfreighter> airfreighterIterator() {
        return airfreighterSet.iterator();
    }

    public Iterator<Airplane> airplaneIterator() {
        Set<Airplane> airplanes = new HashSet<>();
        airplanes.addAll(passengerAirplaneSet);
        airplanes.addAll(airfreighterSet);
        return airplanes.iterator();
    }
}
