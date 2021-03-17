package telran.comporator;

import telran.items.Car;

import java.util.Comparator;

public class ComparatorByEngine implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getEngine(), o2.getEngine());
    }
}
