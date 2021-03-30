package hw_variant1.items;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    LinkedList<Integer> numbers = new LinkedList<>();
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};

    @Before
    public void setUp() throws Exception {
        numbers = new LinkedList<Integer>();
        for (Integer i : arNumbers) {
            numbers.add(i);
        }
    }

    @Test
    public void add() {

    }

    @Test
    public void size() {
    }

    @Test
    public void get() {
    }

    @Test
    public void removeIndex() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void toArray() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void iterator() {
    }
}