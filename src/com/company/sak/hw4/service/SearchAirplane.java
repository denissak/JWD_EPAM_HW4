package com.company.sak.hw4.service;

import com.company.sak.hw4.bean.Airline;
import com.company.sak.hw4.bean.Airplane;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;

import java.util.Iterator;

public class SearchAirplane {
    private Airline airline;
    private double currentFuelCapacity;

    public Airplane searchByFuelAirplane(Airline airline, double currentFuelCapacity) {
        if (airline == null && currentFuelCapacity <= 0) {
            return null;
        }
        this.airline = airline;
        this.currentFuelCapacity = currentFuelCapacity;
        return searchNeededAirplane();
    }

    private Airplane searchNeededAirplane() {
        Iterator<Airplane> neededAirplane = airline.airplaneIterator();
        while (neededAirplane.hasNext()) {
            Airplane airplane = neededAirplane.next();

            if (Double.compare(airplane.getFuelCapacity(), currentFuelCapacity) == 1) {
                return airplane;
            }
        }
        return null;
    }
}
