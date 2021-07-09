package com.company.sak.hw4.service;

import com.company.sak.hw4.bean.Airline;
import com.company.sak.hw4.bean.Airplane;
import com.company.sak.hw4.bean.cargo.Airfreighter;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;

import java.util.Iterator;
import java.util.List;

public class SortedAirplane {
    Airline airline = new Airline();

    private PassengerAirplane passengerAirplane;
    private Airfreighter airfreighter;
    private int neededPassengerCapacity;

    public PassengerAirplane searchByPassengerCapacity(int neededPassengerCapacity){
        if (passengerAirplane.getPassengerCapacity() < neededPassengerCapacity){
            return null;
        }
        return searchNeededPassengerAirplane();
    }

    private PassengerAirplane searchNeededPassengerAirplane () {
        Iterator<PassengerAirplane> neededPassengerAirplane = airline.passengerAirplaneIterator();
        while (neededPassengerAirplane.hasNext()) {
            PassengerAirplane passengerAirplane = neededPassengerAirplane.next();

            if (Double.compare(passengerAirplane.getPassengerCapacity(), neededPassengerCapacity) == 1){
                return passengerAirplane;
            }
        }
        return null;
    }



}
