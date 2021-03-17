import org.junit.Test;

import static org.junit.Assert.*;

public class AnyMethodsTest {
    @Test
    public void testSearchStr() {
        //=================Positive=======================
        String[] ar = {"hello", "bye", "money", "happy"};
        assertEquals(1, AnyMethods.searchStr(ar, "bye"));
        assertEquals(1, AnyMethods.searchStr(ar, " bye"));
        assertEquals(1, AnyMethods.searchStr(ar, "\nbye\n"));
        assertEquals(1, AnyMethods.searchStr(ar, "Bye"));
        assertEquals(2, AnyMethods.searchStr(ar, "money"));
        assertEquals(-1, AnyMethods.searchStr(ar, "Gerbert"));
        String[] ar2 = {"1111", "%%%", "#####", "[[[["};
        assertEquals(3, AnyMethods.searchStr(ar2, "[[[["));
        //=================Negative=======================
        assertEquals(-1, AnyMethods.searchStr(null, "bye"));
        assertEquals(-1, AnyMethods.searchStr(ar, null));
        assertEquals(-1, AnyMethods.searchStr(null, null));
        String[] ar3 = {};
        assertEquals(-1, AnyMethods.searchStr(ar3, "bye"));
        assertEquals(-1, AnyMethods.searchStr(ar, ""));
        String[] ar4 = {null, null, null};
        assertEquals(-1, AnyMethods.searchStr(ar4, "bye"));
        String[] ar5 = {null, null, "bye"};
        assertEquals(2, AnyMethods.searchStr(ar5, "bye"));

    }
}