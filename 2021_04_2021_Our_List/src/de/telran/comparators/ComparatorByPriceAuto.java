package de.telran.comparators;

import de.telran.model.Auto;

import java.util.Comparator;

public class ComparatorByPriceAuto implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return Long.compare(o1.getPrice(), o2.getPrice());
    }

}
