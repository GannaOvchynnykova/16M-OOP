package telran.testArray;

import org.junit.Before;
import org.junit.Test;
import telran.items.MyArray;

import static org.junit.Assert.*;

public class MyArrayTest {
    MyArray strings;
    MyArray numbers;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "fg", "abc"};

    @Before
    public void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer i : arNumbers) {
            numbers.add(i);
        }
        strings = new MyArray();
        for (String str : arStrings) {
            strings.add(str);
        }
    }

    @Test
    public void testSetUp() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        for (int i = 0; i < sizeNumbers; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < sizeStrings; i++) {
            assertEquals(arStrings[i], strings.get(i));
        }
    }

    @Test
    public void testRemoveAtIndex() {
        // 10, 7, 11, -2, 13, 10, 2000
        Integer[] arNumbers_2 = {10, 7, 11, 13, 10, 2000};
        assertEquals(null, numbers.remove(7));
        assertEquals(null, numbers.remove(17));

        Integer res = (Integer) numbers.remove(3);
        assertEquals(-2, (int) res);

        assertEquals(arNumbers.length - 1, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            assertEquals(arNumbers_2[i], numbers.get(i));
        }
    }

    @Test
    public void testRemoveAtIndexBoolean() {
        // 10, 7, 11, -2, 13, 10, 2000
        Integer[] arNumbers_3 = {10, 7, 11, 13, 10, 2000};
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void testIndexOf() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(2, numbers.indexOf(11));
        assertEquals(1, numbers.indexOf(7));
    }

    @Test
    public void testLastIndexOf() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(6, numbers.lastIndexOf(2000));
        assertEquals(5, numbers.lastIndexOf(10));

    }

    @Test
    public void testContains() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(true, numbers.contains(11));
        assertEquals(false, numbers.contains(1));
    }

    @Test
    public void testToArray() {

    }
}