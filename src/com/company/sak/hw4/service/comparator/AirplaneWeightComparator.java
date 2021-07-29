package com.company.sak.hw4.service.comparator;

import com.company.sak.hw4.bean.Airplane;

import java.util.Comparator;

public class AirplaneWeightComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane firstAirplane, Airplane secondAirplane) {
        return Double.compare(firstAirplane.getWeight(), secondAirplane.getWeight());
    }
}
