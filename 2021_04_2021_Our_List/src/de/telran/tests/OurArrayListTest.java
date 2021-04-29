package de.telran.tests;

import de.telran.dto.OurArrayList;
import de.telran.interfaces.IOurList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    IOurList<Integer> integerList;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};

    @BeforeEach
    void setUp() {
        integerList = new OurArrayList<>();
        for (Integer i : arNumbers) {
            integerList.add(i);
        }
    }

    @Test
    void get() {
        assertEquals(10, integerList.get(0));
    }

    @Test
    void add() {
        assertTrue(integerList.add(2));
        assertEquals(integerList.size(), arNumbers.length+1);
    }

    @Test
    void removeIndex() {
        // 10, 7, 11, -2, 13, 10, 2000
        Integer[] arNumbers_2 = {10, 7, 11, 13, 10, 2000};

        assertEquals(null, integerList.remove(7));
        assertEquals(null, integerList.remove(17));

        Integer res = (Integer) integerList.remove(3);
        assertEquals(-2, (int) res);

        assertEquals(arNumbers.length - 1, integerList.size());
        for (int i = 0; i < integerList.size(); i++) {
            assertEquals(arNumbers_2[i], integerList.get(i));
        }
    }

    @Test
    void testRemove() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertTrue(integerList.remove((Integer)10));
        assertEquals(arNumbers.length-1, integerList.size());
        assertEquals(7, integerList.get(0));
        assertEquals(10, integerList.get(integerList.size()-2));
        assertTrue(integerList.remove((Integer)10));
    }

    @Test
    void set() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(11, integerList.set(2, 5));
        assertEquals(integerList.size(), arNumbers.length);
        assertEquals(10, integerList.set(0, 5));
    }

    @Test
    void contains() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(true, integerList.contains(11));
        assertTrue(integerList.contains(10));
        assertFalse(integerList.contains(101));
        assertFalse(integerList.contains(null));
        assertEquals(false, integerList.contains(1));
    }
}