package hw_variant1.comporator;

import hw_variant1.items.Car;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
