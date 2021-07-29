package com.company.sak.hw4.dao;

import com.company.sak.hw4.bean.Airplane;
import com.company.sak.hw4.exception.NoFileException;

import java.io.IOException;
import java.util.List;

public interface AirplaneDAOService {
    List<Airplane> getAllAirplanes () throws NoFileException;
}
