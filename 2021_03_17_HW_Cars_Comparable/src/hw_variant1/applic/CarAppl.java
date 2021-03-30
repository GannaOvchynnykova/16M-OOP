package hw_variant1.applic;

import hw_variant1.comporator.*;
import hw_variant1.items.Car;

import java.util.Arrays;
import java.util.Comparator;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(2015, "Audi", "black", 234.764, 8.078),
                new Car(2018, "BMW", "red", 334.768, 7.034),
                new Car(2013, "Careta", "yellow", 297.665, 5.900),
                new Car(2014, "Deo", "green", 564.006, 10.676),
                new Car(2021, "Solo", "white", 123.761, 10.676),
                new Car(2023, "Mono", "blue", 500.215, 9.654),
                new Car(2010, "Kabri", "gold", 359.765, 8.323),
                new Car(2017, "Porsh", "tifani", 234.766, 7.456),
                new Car(2016, "Mersedes", "aqva", 153.897, 11.000),
                new Car(2012, "Lada", "lila", 294.765, 8.777),
        };

        displayCar(cars);
        System.out.println("/---------------ComparatorByYear---------------------------------");
        Comparator<Car> compYear = new ComparatorByYear();
        Arrays.sort(cars, compYear);
        displayCar(cars);

        System.out.println("/-----------------Comparable model-------------------------------");
        Arrays.sort(cars);
        displayCar(cars);

        System.out.println("/----------------ComparatorByColour--------------------------------");
        Comparator<Car> compColour = new ComparatorByColour();
        Arrays.sort(cars, compColour);
        displayCar(cars);

        System.out.println("/------------------ComparatorByEngine------------------------------");
        Comparator<Car> compEngine = new ComparatorByEngine();
        Arrays.sort(cars, compEngine);
        displayCar(cars);

        System.out.println("/-----------------ComparatorByPrice-------------------------------");
        Comparator<Car> compPrice = new ComparatorByPrice();
        Arrays.sort(cars, compPrice);
        displayCar(cars);

        System.out.println("/------------------ComparatorByYearAndPrice------------------------------");
        Comparator<Car> compPriceYear = new ComparatorByPriceAndYear();
        Arrays.sort(cars, compPriceYear);
        displayCar(cars);
    }

    private static void displayCar(Car[] cars) {
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
