package hw_variant1.comporator;

import hw_variant1.items.Car;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear()-o2.getYear();
    }
}
