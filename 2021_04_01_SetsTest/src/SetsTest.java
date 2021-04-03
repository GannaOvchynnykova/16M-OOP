import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class SetsTest {
    //Set<Integer> set;       1 variant
    Set<Integer> set = new HashSet<>();
    Integer[] test = {3, 1, 8, 0, 9, 7, 4, 2, 11};

    @org.junit.Before
    public void setUp() throws Exception {
        /*for (int i = 0; i < test.length; i++) {
            set.add(test[i]);
        } */                                                     //2 variant
        set = new HashSet<Integer>(Arrays.asList(test));     // 1 variant
        //set = new LinkedHashSet<Integer>(Arrays.asList(test));
        //set = new TreeSet<Integer>(Arrays.asList(test));
    }

    @Test
    public void testAdd() {
        assertEquals(test.length, set.size());
        for (Integer i : test) {
            assertTrue(set.contains(i));
        }
        //assertTrue(set.containsAll(Arrays.asList(test)));

        //Integer[] test2 = {3, 1, 8, 0, 9, 7, 4, 2, 11, 12};
        //assertTrue(set.containsAll(Arrays.asList(test2)));  false
        //assertEquals(test.length, set.size());  false

        //Integer[] test2 = {3, 1, 8, 0, 9, 7, 4};
        //assertTrue(set.containsAll(Arrays.asList(test2)));  true
        //assertEquals(test.length, set.size());  false

        //Integer[] test2 = {3, 1, 8, 0, 9, 7, 4,  2, 11, 11};
        //assertTrue(set.containsAll(Arrays.asList(test2)));  false
        //assertEquals(test.length, set.size());  false

        assertTrue(set.add(12));
        assertEquals(test.length + 1, set.size());
        assertTrue(set.contains(12));
        //------------------negativ
        assertFalse(set.add(0));
        assertEquals(test.length + 1, set.size());
        //--------------------
        List<Integer> list = new LinkedList<>(Arrays.asList(22, 23, 24));
        assertTrue(set.addAll(list));   // ne fakt 4to vse dobavil
        assertEquals(test.length + 4, set.size());
        assertTrue(set.containsAll(list));
    }

    @Test
    public void testRemove() {
        //Integer[] test = {3, 1, 8, 0, 9, 7, 4, 2, 11};
        assertTrue(set.remove(0));
        assertEquals(test.length - 1, set.size());
        assertFalse(set.contains(0));
        //---------------negativ
        assertFalse(set.remove(0));
        assertEquals(test.length - 1, set.size());
        //-------------------------
        assertTrue(set.removeAll(Arrays.asList(3, 1, 33, 44, 55)));   // delete only 2 elements
        assertEquals(test.length - 3, set.size());
        assertTrue(set.containsAll(Arrays.asList(8, 9, 7, 4, 2, 11)));

        assertFalse(set.removeAll(Arrays.asList(99, 77, 88, 14)));
        assertEquals(test.length - 3, set.size());

        assertTrue(set.removeAll(Arrays.asList(8, 9, 7, 4, 2, 11)));
        assertTrue(set.isEmpty());
    }

    @Ignore
    @Test
    public void testLinkedHashSet() {
        //Integer[] test = {3, 1, 8, 0, 9, 7, 4, 2, 11};

        /*int count = 0;
        for (Integer num : set) {
            assertEquals(test[count++], num);          1 variant
        }*/

        assertArrayEquals(test, set.toArray(new Integer[0]));        //2 variant

    }
}