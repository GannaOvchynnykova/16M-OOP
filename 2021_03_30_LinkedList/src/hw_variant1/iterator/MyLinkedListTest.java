package hw_variant1.iterator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    LinkedList<Integer> numbers = new LinkedList<>();
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};

    @Before
    public void setUp() throws Exception {
        numbers = new LinkedList<Integer>(Arrays.asList(arNumbers));
    }

    @Test
    public void add() {
        assertEquals(numbers.size(), arNumbers.length);
        for (Integer i : arNumbers) {
            assertTrue(numbers.contains(i));
        }
        assertTrue(numbers.containsAll(Arrays.asList(arNumbers)));

        assertTrue(numbers.add(13));
        assertEquals(numbers.size(), arNumbers.length + 1);
        assertTrue(numbers.contains(13));

        assertTrue(numbers.add(0));
        assertEquals(numbers.size(), arNumbers.length + 2);
        assertTrue(numbers.contains(0));

        LinkedList<Integer> numbersNew = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(numbers.addAll(numbersNew));
        assertTrue(numbers.containsAll(numbersNew));
        assertEquals(numbers.size(), arNumbers.length + 7);

    }

    @Test
    public void size() {
        assertEquals(numbers.size(), arNumbers.length);
    }

    @Test
    public void get() {
        //Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        Integer res = numbers.get(6);
        assertEquals(2000, (int) res);
    }

    @Test
    public void removeIndex() {
        //Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        numbers.remove(0);
        assertEquals(numbers.size(), arNumbers.length - 1);
        //Integer[] arNumbers = {7, 11, -2, 13, 10, 2000};
        Integer res = numbers.remove(3);
        assertEquals(13, (int) res);
        assertEquals(numbers.size(), arNumbers.length - 2);

    }

    @Test
    public void testRemove() {
        //Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        assertEquals(false, numbers.remove((Integer) 1));
        assertEquals(true, numbers.remove((Integer) 10));
        assertEquals(numbers.size(), arNumbers.length - 1);
    }

    @Test
    public void indexOf() {
        assertEquals(0, numbers.indexOf(10));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf("kykysiki"));
    }

    @Test
    public void lastIndexOf() {
        assertEquals(5, numbers.lastIndexOf(10));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(-1, numbers.indexOf("kykysiki"));
    }

    @Test
    public void contains() {
        //Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        assertEquals(true, numbers.contains(-2));
        assertEquals(false, numbers.contains(null));
        assertEquals(false, numbers.contains("kykysiki"));
    }

    @Test
    public void toArray() {
        Integer[] myNumbers = {10, 7, 11, -2, 13, 10, 2000};
        assertArrayEquals(myNumbers, numbers.toArray());

    }

    @Test
    public void clear() {
        numbers.clear();
        assertEquals(0, numbers.size());
    }

    @Test
    public void iterator() {
        int index = 0;
        for (Object o : numbers) {
            assertEquals(arNumbers[index++], o);
        }
        assertEquals(arNumbers.length, index);
    }
}