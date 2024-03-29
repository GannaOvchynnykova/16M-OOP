package de.telran.tests;

import de.telran.comparators.IntegerNaturalComparator;
import de.telran.interfaces.IOurList;
import de.telran.items.OurArrayList;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {
    //TODO come up with all possible cases to test

    IOurList<Integer> integerList = new OurArrayList<>();

    @Test
    public void testSize_newList() {
        assertEquals(0, integerList.size());
    }

    @Test
    public void testAddAndGet_severalElements() {
        integerList.add(7);
        integerList.add(17);
        integerList.add(5);

        assertEquals(3, integerList.size());

        assertEquals(7, integerList.get(0));
        assertEquals(17, integerList.get(1));
        assertEquals(5, integerList.get(2));
    }

    @Test
    public void testAddAndGet_severalElements_throwsIOOBE() {
        integerList.add(-7);
        integerList.add(-17);
        integerList.add(5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            integerList.get(-3);
        });

        // another way
        try {
            integerList.get(-3);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> {
            integerList.get(3);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            integerList.get(-1);
        });

        assertEquals(3, integerList.size());
    }

    @Test
    public void testIteratorZero() {
        Iterator<Integer> it = integerList.iterator();
        assertFalse(it.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> it.next());

    }

    @Test
    public void testIteratorSeveral() {
        integerList.add(-7);
        integerList.add(-17);
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        Iterator<Integer> integerIterator = integerList.iterator();
        int[] exp = {-7, -17, 5, 8, 3};
        int i = 0;
        //here we write the code which is the correct way to use iterator
        while (integerIterator.hasNext()) {
            int position = integerIterator.next();
            assertEquals(exp[i], position);
            i++;
        }
        assertEquals(5, i);
        assertThrows(IndexOutOfBoundsException.class, () -> integerIterator.next());


    }

    @Test
    public void testBackIteratorZero() {
        Iterator<Integer> it = integerList.backwardIterator();
        assertFalse(it.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> it.next());

    }

    @Test
    public void testBackIteratorSeveral() {
        integerList.add(-7);
        integerList.add(-17);
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        Iterator<Integer> integerIterator = integerList.backwardIterator();
        int[] exp = {3, 8, 5, -17, -7};
        int i = 0;
        //here we write the code which is the correct way to use iterator
        while (integerIterator.hasNext()) {
            int position = integerIterator.next();
            assertEquals(exp[i], position);
            i++;
        }
        assertEquals(5, i);
        assertThrows(IndexOutOfBoundsException.class, () -> integerIterator.next());
    }

    @Test
    public void testSortSeveral() {
        integerList.add(-7);
        integerList.add(-17);
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);

        integerList.sort(new IntegerNaturalComparator());
        Iterator<Integer> integerIterator = integerList.iterator();
        int[] exp = {-17, -7, 3, 5, 8};
        int i = 0;
        //here we write the code which is the correct way to use iterator
        while (integerIterator.hasNext()) {
            int position = integerIterator.next();
            assertEquals(exp[i], position);
            i++;
        }
        assertEquals(5, i);
        assertThrows(IndexOutOfBoundsException.class, () -> integerIterator.next());
    }

    @Test
    public void testMax(){
        integerList.add(-7);
        integerList.add(-17);
        integerList.add(17);
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        assertEquals(17, integerList.max(new IntegerNaturalComparator()));
    }

    @Test
    public void testMin(){
        integerList.add(-7);
        integerList.add(-17);
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        assertEquals(-17, integerList.min(new IntegerNaturalComparator()));
    }
}