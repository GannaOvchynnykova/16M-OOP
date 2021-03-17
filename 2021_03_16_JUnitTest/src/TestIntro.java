import org.junit.Test;

import static org.junit.Assert.*;

class TestIntr {

    @Test
    public void testEquals() {
        assertEquals(4, 2 + 2);
        assertEquals("Hello", "Hel" + "lo");
        assertEquals(3.6, 1.2 * 3, 0.0001);
        assertNotEquals("Hel lo", "Hel" + "lo");
    }

    @Test
    public void testArrayEquals() {
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = {1, 2, 3, 4, 5};
        assertArrayEquals(ar, ar2);
        //	int[] ar3 = {1,2,3,4,5,6};
        //	assertArrayEquals(ar, ar3);

    }

    @Test
    public void testNull() {
        String s = null;
        assertNull(s);
        s = "";
        assertNotNull(s);
    }

    @Test
    public void testTrueFalse() {
        assertTrue(2 > 1);
        assertFalse(2 < 1);
    }

    @Test
    public void testSame() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        assertSame(str1, str2);
        assertNotSame(str1, str3);
        assertEquals(str1, str3);

    }
}
