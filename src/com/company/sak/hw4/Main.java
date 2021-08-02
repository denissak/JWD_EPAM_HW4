package com.company.sak.hw4;

import com.company.sak.hw4.dao.impl.AirplaneDAOServiceImpl;
import com.company.sak.hw4.exception.NoFileException;
import com.company.sak.hw4.service.AirplaneService;
import com.company.sak.hw4.service.impl.AirplaneServiceImpl;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {




    public static void main(String[] args) throws IOException {
        AirplaneDAOServiceImpl airplaneDAOService = new AirplaneDAOServiceImpl();
        AirplaneServiceImpl as = new AirplaneServiceImpl(airplaneDAOService);

        try {
            System.out.println(as.calculateCargoCapacity());
        } catch (NoFileException e) {
            e.printStackTrace();
        }
    }






}
