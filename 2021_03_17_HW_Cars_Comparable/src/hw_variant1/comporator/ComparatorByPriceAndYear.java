package hw_variant1.comporator;

import hw_variant1.items.Car;

import java.util.Comparator;

public class ComparatorByPriceAndYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int result = Double.compare(o1.getPrice(), o2.getPrice());
        return result == 0 ? o2.getYear() - o1.getYear() : result;
       // return result != 0? result: o1.getYear()-o2.getYear();
    }
}
