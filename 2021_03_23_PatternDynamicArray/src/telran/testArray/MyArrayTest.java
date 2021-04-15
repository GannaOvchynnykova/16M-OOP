package telran.testArray;

import org.junit.Before;
import org.junit.Test;
import telran.interfaces.IList;
import telran.model.MyArray;

import static org.junit.Assert.*;

public class MyArrayTest {
    IList strings;
    IList numbers;
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
        assertTrue(numbers.remove((Integer)10));
        assertEquals(arNumbers.length-1, numbers.size());
        assertEquals(7, numbers.get(0));
        assertEquals(10, numbers.get(numbers.size()-2));
        assertTrue(numbers.remove((Integer)10));
        assertEquals(-1, numbers.indexOf(10));
        assertFalse(numbers.remove((Integer)101));
        assertFalse(numbers.remove(null));
        assertFalse(numbers.remove("abc"));
    }

    @Test
    public void testIndexOf() {
        // 10, 7, 11, -2, 13, 10, 2000
        //Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        //String[] arStrings = {"abc", "lmn", "fg", "abc"};
        assertEquals(-1, numbers.indexOf(-100));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf("abc"));
        assertEquals(0, numbers.indexOf(10));
        //------------------------------------------------
        assertEquals(0, strings.indexOf("abc"));
        assertEquals(-1, strings.indexOf("ooo"));
        assertEquals(-1, strings.indexOf(null));
        assertEquals(-1, strings.indexOf(1000));

    }

    @Test
    public void testLastIndexOf() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(5, numbers.lastIndexOf(10));
        assertEquals(-1, numbers.lastIndexOf(-100));
        assertEquals(-1, numbers.lastIndexOf(null));
        assertEquals(-1, numbers.lastIndexOf("abc"));

        //assertEquals(strings.size()-1, strings.indexOf("abc"));
        assertEquals(-1, strings.lastIndexOf("ooo"));
        assertEquals(-1, strings.lastIndexOf(null));
        assertEquals(-1, strings.lastIndexOf(1000));

    }

    @Test
    public void testContains() {
        // 10, 7, 11, -2, 13, 10, 2000
        assertEquals(true, numbers.contains(11));
        assertTrue(numbers.contains(10));
        assertFalse(numbers.contains(101));
        assertFalse(numbers.contains(null));
        assertEquals(false, numbers.contains(1));
    }

    @Test
    public void testToArray() {
        Object[] exNumbers = {10, 7, 11, -2, 13, 10, 2000};
        Object[] exStrings = {"abc", "lmn", "fg", "abc"};
        assertArrayEquals(exNumbers, numbers.toArray());
        assertArrayEquals(exStrings, strings.toArray());
    }

    @Test
    public void testClear(){
        numbers.clear();
        assertEquals(0, numbers.size());
        strings.clear();
        assertEquals(0, strings.size());
    }

    @Test
    public void testIterable(){
        int index = 0;
        for (Object o: numbers) {
            assertEquals(arNumbers[index++], o);
        }
        assertEquals(arNumbers.length, index);
    }
}