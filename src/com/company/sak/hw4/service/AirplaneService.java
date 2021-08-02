package com.company.sak.hw4.service;

import com.company.sak.hw4.exception.NoFileException;


public interface AirplaneService<T> {
    double calculateLiftingCapacity() throws NoFileException;

    double calculateCargoCapacity() throws NoFileException;

    double calculatePassengerCapacity() throws NoFileException;


}
