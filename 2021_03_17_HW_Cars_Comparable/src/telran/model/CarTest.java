package telran.model;

import org.junit.Before;
import org.junit.Test;
import telran.comporator.ComparatorByYear;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    Car car1 = new Car(2015, "Audi", "black", 234.764, 8.078);
    Car car2 = new Car(2018, "BMW", "red", 334.768, 7.034);
    Car car3 = new Car(2013, "Careta", "yellow", 297.665, 5.900);
    Car car4 = new Car(2014, "Deo", "green", 564.006, 10.676);
    Car car5 = new Car(2021, "Solo", "white", 123.761, 10.676);
    Car car6 = new Car(2023, "Mono", "blue", 500.215, 9.654);
    Car car7 = new Car(2010, "Kabri", "gold", 359.765, 8.323);
    Car car8 = new Car(2017, "Porsh", "tifani", 234.766, 7.456);
    Car car9 = new Car(2016, "Mersedes", "aqva", 153.897, 11.000);
    Car car10 = new Car(2012, "Lada", "lila", 294.765, 8.777);
    Car[] cars;

    @Before
    public void setUp() throws Exception {
        cars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }

    @Test
    public void testComparable() {
        Arrays.sort(cars);
        Car[] ex = new Car[]{car1, car2, car3, car4, car7, car10, car9, car6, car8, car5};
        assertArrayEquals(ex, cars);
    }

    @Test
    public void testComparatorByYear() {
        Arrays.sort(cars, new ComparatorByYear());
        //Car [] ex2 = new Car[]{car7, car10, car3, car4, car1, car9, car8, car2, car5, car6};
        for (int i = 0; i < cars.length-1; i++) {
            assertTrue(cars[i].getYear() <= cars[i + 1].getYear());
        }
    }
}