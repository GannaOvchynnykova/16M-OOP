package de.telran.comparators;

import java.util.Comparator;

public class IntegerNaturalComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1.compareTo(o2);
        return o1.intValue() - o2.intValue();
        //return Integer.compare(o1, o2);
    }
}
