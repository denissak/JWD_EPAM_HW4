package com.company.sak.hw4.service;

import com.company.sak.hw4.bean.Airplane;

import java.util.Comparator;
import java.util.List;

public interface AirplaneService<T> {
    double calculateLiftingCapacity();

    double calculateCargoCapacity();

    double calculatePassengerCapacity();

    void sort(List<T> airplanes, Comparator<T> comparator);

}
