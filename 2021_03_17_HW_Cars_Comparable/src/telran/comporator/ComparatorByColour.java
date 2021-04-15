package telran.comporator;

import telran.model.Car;

import java.util.Comparator;

public class ComparatorByColour implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
