package com.company.sak.hw4;

import com.company.sak.hw4.dao.impl.AirplaneDAOServiceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AirplaneDAOServiceImpl ai = new AirplaneDAOServiceImpl();
        try {
            ai.getAllAirplanes();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
