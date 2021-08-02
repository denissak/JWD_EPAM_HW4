package com.company.sak.hw4.service.impl;

import com.company.sak.hw4.bean.Airplane;
import com.company.sak.hw4.bean.cargo.Airfreighter;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;
import com.company.sak.hw4.dao.AirplaneDAOService;
import com.company.sak.hw4.exception.NoFileException;
import com.company.sak.hw4.service.AirplaneService;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {

    private final AirplaneDAOService airplaneDAOService;

    public AirplaneServiceImpl(AirplaneDAOService airplaneDAOService) {
        this.airplaneDAOService = airplaneDAOService;
    }

    @Override
    public double calculateLiftingCapacity() throws NoFileException {

        double totalLiftingCapacity = 0;
        List<Airplane> airplanes = airplaneDAOService.getAllAirplanes();
        for (Airplane airplane : airplanes) {
            if (airplane instanceof Airfreighter) {
                totalLiftingCapacity += ((Airfreighter) airplane).getLiftingСapacity();
            }
        }
        return totalLiftingCapacity;
    }

    @Override
    public double calculateCargoCapacity() throws NoFileException {
        double totalCargoCapacity = 0;
        List<Airplane> airplanes = airplaneDAOService.getAllAirplanes();
        for (Airplane airplane : airplanes) {
            if (airplane instanceof Airfreighter) {
                totalCargoCapacity += ((Airfreighter) airplane).getCargoCapacity();
            }
        }
        return totalCargoCapacity;
    }

    @Override
    public double calculatePassengerCapacity() throws NoFileException {
        double totalPassengerCapacity = 0;
        List<Airplane> airplanes = airplaneDAOService.getAllAirplanes();
        for (Airplane airplane : airplanes) {
            if (airplane instanceof PassengerAirplane) {
                totalPassengerCapacity += ((PassengerAirplane) airplane).getPassengerCapacity();
            }
        }
        return totalPassengerCapacity;
    }

    public void sort(List<PassengerAirplane> passengerAirplanes) {
        if (passengerAirplanes != null) {
            for (int i = passengerAirplanes.size() - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (passengerAirplanes.get(j).getPassengerCapacity() > passengerAirplanes.get(j + 1).getPassengerCapacity()) {
                        PassengerAirplane passengerAirplane = passengerAirplanes.get(j);
                        passengerAirplanes.set(j, passengerAirplanes.get(j + 1));
                        passengerAirplanes.set(j + 1, passengerAirplane);
                    }
                }
            }
        }
    }


}

