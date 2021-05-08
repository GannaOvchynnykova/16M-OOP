package de.telran.tests;

import de.telran.comparators.ComparatorByPriceAuto;
import de.telran.interfaces.IOurList;
import de.telran.items.OurArrayList;
import de.telran.model.Auto;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AutoTest {
    Auto car1 = new Auto("Audi", "black", 234764);
    Auto car2 = new Auto("BMW", "red", 334768);
    Auto car3 = new Auto("Careta", "yellow", 297665);
    Auto car4 = new Auto("Deo", "green", 564006);
    Auto car5 = new Auto("Solo", "white", 123761);

    IOurList<Auto> autoIOurList = new OurArrayList<Auto>();

    @Test
    public void testSize_newList() {
        assertEquals(0, autoIOurList.size());
    }

    @Test
    public void testSort(){
        autoIOurList.add(car1);
        autoIOurList.add(car2);
        autoIOurList.add(car3);
        autoIOurList.add(car4);
        autoIOurList.add(car5);

        assertEquals(5, autoIOurList.size());
        autoIOurList.sort(new ComparatorByPriceAuto());
        Iterator<Auto> autoIterator = autoIOurList.iterator();

        Auto [] exp = {car5, car1, car3, car2, car4};
        int i = 0;
        while (autoIterator.hasNext()) {
            Auto position = autoIterator.next();
            assertEquals(exp[i], position);
            i++;
        }
        assertEquals(5, i);
        assertThrows(IndexOutOfBoundsException.class, () -> autoIterator.next());
    }

    @Test
    public void testMax(){
        autoIOurList.add(car1);
        autoIOurList.add(car2);
        autoIOurList.add(car3);
        autoIOurList.add(car4);
        autoIOurList.add(car5);
        assertEquals(car4, autoIOurList.max(new ComparatorByPriceAuto()));
    }

    @Test
    public void testMin(){
        autoIOurList.add(car1);
        autoIOurList.add(car2);
        autoIOurList.add(car3);
        autoIOurList.add(car4);
        autoIOurList.add(car5);
        assertEquals(car5, autoIOurList.min(new ComparatorByPriceAuto()));
    }


}