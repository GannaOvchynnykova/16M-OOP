package telran;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.*;

public class ArrayListLinkedListTest {
    List<String> stringList;
    String[] strArr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};

    @org.junit.Before
    public void setUp() throws Exception {
        stringList = new ArrayList<>();
        stringList = new LinkedList<>();
        stringList.addAll(Arrays.asList(strArr));
    }

    @Test
    public void testAdd() {
        assertEquals(strArr.length, stringList.size());
        for (int i = 0; i < strArr.length; i++) {
            assertEquals(strArr[i], stringList.get(i));
        }
        //String[] strArr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};
        stringList.add(0, "Kaxa");
        assertEquals(strArr.length + 1, stringList.size());
        assertEquals("Kaxa", stringList.get(0));
        assertEquals("Igor", stringList.get(1));

        //String[] strArr = {"Kaxa", "Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};
        stringList.add(strArr.length / 2, "Pedro");
        assertEquals(strArr.length + 2, stringList.size());
        assertEquals("Asya", stringList.get(2));

        //String[] strArr = {"Kaxa", "Igor", "Asya", "Pedro", "Galina", "Bibigul", "Feofan", "Fekla"};
        assertTrue(stringList.add("Lev"));
        assertEquals(strArr.length + 3, stringList.size());
        assertEquals("Lev", stringList.get(stringList.size() - 1));
        assertEquals(stringList.size() - 1, stringList.indexOf("Lev"));
    }

    @Test
    public void testRemove() {
        assertEquals(strArr.length, stringList.size());
        int oldSize = stringList.size();
        //String[] strArr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};
        assertEquals("Igor", stringList.remove(0));
        assertEquals(oldSize - 1, stringList.size());
        assertFalse(stringList.contains("Igor"));

        //String[] strArr = {"Asya", "Galina", "Bibigul", "Feofan", "Fekla"};
        assertEquals("Bibigul", stringList.remove(stringList.size() / 2));
        assertEquals("Galina", stringList.get(1));
        assertEquals("Feofan", stringList.get(2));
        assertEquals(oldSize - 2, stringList.size());
        assertFalse(stringList.contains("Bibigul"));

        //String[] strArr = {"Asya", "Pedro", "Galina", "Feofan", "Fekla"};
        assertEquals("Fekla", stringList.remove(stringList.size() - 1));
        assertEquals("Feofan", stringList.get(stringList.size() - 1));
        assertEquals(oldSize - 3, stringList.size());
        assertFalse(stringList.contains("Fekla"));
    }
}