package com.company.sak.hw4.dao;

import com.company.sak.hw4.bean.Airplane;
import com.company.sak.hw4.bean.cargo.Airfreighter;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;
import com.company.sak.hw4.exception.NoFileException;

import java.io.IOException;
import java.util.List;

public interface AirplaneDAOService {
    List<Airplane> getAllAirplanes () throws NoFileException;

    List<PassengerAirplane> getAllPassenferAirplane() throws NoFileException;

    List<Airfreighter> getAllAirfreighter() throws NoFileException;
}
