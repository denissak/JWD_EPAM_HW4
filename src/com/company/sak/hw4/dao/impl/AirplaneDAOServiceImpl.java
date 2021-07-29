package com.company.sak.hw4.dao.impl;

import com.company.sak.hw4.bean.Airplane;
import com.company.sak.hw4.bean.cargo.Airfreighter;
import com.company.sak.hw4.bean.passenger.PassengerAirplane;
import com.company.sak.hw4.dao.AirplaneDAOService;
import com.company.sak.hw4.exception.NoFileException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirplaneDAOServiceImpl implements AirplaneDAOService {
    @Override
    public List<Airplane> getAllAirplanes() throws NoFileException {

        List<Airplane> airplanes = new ArrayList<>();

        File movieReviews = new File("C:\\hw4\\airplines.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(movieReviews);
        } catch (FileNotFoundException e) {
            throw new NoFileException();
        }

        while (scanner.hasNextLine()) {
            String[] airplaneOne = scanner.nextLine().split(",");
            if (Integer.valueOf(airplaneOne[5]) != 0) {

                Airplane passengerAirplane = new PassengerAirplane(airplaneOne[0], Double.valueOf(airplaneOne[1]),
                        Double.valueOf(airplaneOne[2]),Double.valueOf(airplaneOne[3]),Double.valueOf(airplaneOne[4]),
                        Integer.valueOf(airplaneOne[5]));
                airplanes.add(passengerAirplane);
            }else {
                Airplane airfreighter = new Airfreighter(airplaneOne[0], Double.valueOf(airplaneOne[1]),
                        Double.valueOf(airplaneOne[2]),Double.valueOf(airplaneOne[3]),Double.valueOf(airplaneOne[4]),
                        Double.valueOf(airplaneOne[6]),Double.valueOf(airplaneOne[7]));
                airplanes.add(airfreighter);
            }
        }
        return airplanes;
    }
}
