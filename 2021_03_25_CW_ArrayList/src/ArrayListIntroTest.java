import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ArrayListIntroTest {

    List<Integer> listInt;
    List<String> listStr;
    Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
    String[] strAr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};

    @org.junit.Before
    public void setUp() throws Exception {
        listInt = new LinkedList<>();
        listStr = new LinkedList<>();
        /*for (Integer num : intAr) {           // fill the collection      //1 variant
            listInt.add(num);
        }
        for (String str : strAr) {
            listStr.add(str);
        } */
        listInt.addAll(Arrays.asList(intAr));  // fill the collection      //2 variant    //not work with primitives
        listStr.addAll(Arrays.asList(strAr));          // fixed length!!!!!!!!!!!!!!!!!!!
        // List<Integer> test = Arrays.asList(intAr);           // fixed length
        //test.add(10);
        // listInt.add(121879);    ---------------- tak yes ad
    }

    @Test
    public void testAdd() {
        assertEquals(intAr.length, listInt.size());
        for (int i = 0; i < intAr.length; i++) {
            assertEquals(intAr[i], listInt.get(i));
        }
        assertTrue(listInt.add(100500));
        assertEquals(intAr.length + 1, listInt.size());
        assertEquals((Integer) 100500, listInt.get(listInt.size() - 1));           // variant 1
        assertEquals(listInt.size() - 1, listInt.indexOf(100500));        // variant 2

        assertTrue(listInt.add(null));
        assertEquals(intAr.length + 2, listInt.size());
        assertEquals((Integer) null, listInt.get(listInt.size() - 1));
        assertEquals(listInt.size() - 1, listInt.indexOf(null));

        listInt.add(0, 200000);
        assertEquals(intAr.length + 3, listInt.size());
        assertEquals((Integer) 200000, listInt.get(0));
        assertEquals((Integer) 5, listInt.get(1));

        listInt.addAll(4, Arrays.asList(10, 20, 30));
        Integer[] test = {200000, 5, 3, 7, 10, 20, 30, 2, 9, 0, 1, 2, 3, 100500, null};
        assertEquals(test.length, listInt.size());
        for (int i = 0; i < listInt.size(); i++) {
            assertEquals(test[i], listInt.get(i));
        }
    }

    @Test
    public void testGet() {
        //Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
        assertEquals((Integer) 3, listInt.get(1));
        assertNull(errorGet(listInt.size()));
        assertNull(errorGet(-1));
    }

    private Object errorGet(int index) {
        if (index < 0 || index >= listInt.size()) return null;
        return listInt.get(index);
    }

    @Test
    public void testSet() {
        //Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
        assertEquals((Integer) 3, listInt.set(1, 1000));
        assertEquals(intAr.length, listInt.size());
        assertEquals((Integer) 1000, listInt.get(1));
    }

    @Test
    public void testRemove() {
        //Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
        int oldSize = listInt.size();
        assertEquals((Integer) 5, listInt.remove(0));
        assertEquals(oldSize - 1, listInt.size());
        assertFalse(listInt.contains(5));

        assertTrue(listInt.remove((Integer) 0));
        assertEquals(oldSize - 2, listInt.size());
        assertFalse(listInt.contains(0));

        assertTrue(listInt.remove((Integer) 2));
        assertEquals(oldSize - 3, listInt.size());
        assertEquals(listInt.size() - 2, listInt.indexOf(2));
    }

    @Test
    public void testRemoveAll() {
        //Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
        assertTrue(listInt.removeAll(Arrays.asList(23, 11, 9, -1)));
        assertEquals(intAr.length - 1, listInt.size());
        assertFalse(listInt.contains(9));

        assertFalse(listInt.removeAll(Arrays.asList(23, 11, 19, -1)));
        assertEquals(intAr.length - 1, listInt.size());

        assertTrue(listInt.removeAll(Arrays.asList(3)));
        assertEquals(intAr.length - 3, listInt.size());
        assertFalse(listInt.contains(3));
    }

    @Test
    public void testRetainAll() {
        //Integer[] intAr = {5, 3, 7, 2, 9, 0, 1, 2, 3};
        assertFalse(listInt.retainAll(Arrays.asList(2, 3, 1, 0, 9, 5, 7)));
        assertEquals(intAr.length, listInt.size());

        assertTrue(listInt.retainAll(Arrays.asList(23, 11, 9, -1)));        // delete all but not this one
        assertEquals(1, listInt.size());
        assertTrue(listInt.contains(9));

        assertTrue(listInt.retainAll(Arrays.asList(23, 11, 19, -1)));
        assertTrue(listInt.isEmpty());
    }

    @Test
    public void testComparator() {
        Collections.sort(listInt);
        for (int i = 0; i < listInt.size() - 1; i++) {
            if (listInt.get(i) > listInt.get(i + 1))
                fail("Not sorted!");
        }
    }

    @Test
    public void testClear() {
        assertFalse(listInt.isEmpty());
        listInt.clear();
        assertTrue(listInt.isEmpty());
    }
}