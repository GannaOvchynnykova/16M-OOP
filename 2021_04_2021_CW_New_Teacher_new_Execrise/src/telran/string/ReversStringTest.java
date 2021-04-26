package telran.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversStringTest {
    String str = "Hello";
    String revers = "olleH";

    @Test
    public void testGetStrReverse() {
        //positiv
        Assert.assertEquals("olleH", ReversString.reversString(str));
        Assert.assertEquals("olleH", ReversString.reversString(str + " "));
        Assert.assertEquals("olleH", ReversString.reversString(" " + str + " "));
        Assert.assertEquals(revers, ReversString.reversString(str));
        //negativ
        assertNull(ReversString.reversString(""));
        assertNull(ReversString.reversString("    "));
        assertNull(ReversString.reversString(null));
    }
}