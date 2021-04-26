package telran.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPracticeHwTest {
    String str = "Hello";
    String sent = "Two beers or not two beers";

    @Test
    public void testGetStrReverse() {
        //positiv
        Assert.assertEquals("olleH", StringPracticeHw.getStrReverse(str));
        Assert.assertEquals("olleH", StringPracticeHw.getStrReverse(str + " "));
        Assert.assertEquals("olleH", StringPracticeHw.getStrReverse(" " + str + " "));
        //negativ
        assertNull(StringPracticeHw.getStrReverse(""));
        assertNull(StringPracticeHw.getStrReverse("    "));
        assertNull(StringPracticeHw.getStrReverse(null));
    }

    @Test
    public void testGetCountWords() {
        //positiv
        Assert.assertEquals((Integer) 2, StringPracticeHw.getCountWords(sent, "two"));
        Assert.assertEquals((Integer) 2, StringPracticeHw.getCountWords(sent, "two "));
        Assert.assertEquals((Integer) 2, StringPracticeHw.getCountWords(sent, "beers"));
        Assert.assertEquals((Integer) 0, StringPracticeHw.getCountWords(sent, "three"));
        /*assertNull(telran.string.StringPracticeHw.getCountWords(sent, null));
        assertNull(telran.string.StringPracticeHw.getCountWords(null, "two"));
        assertNull(telran.string.StringPracticeHw.getCountWords(null, null));
        assertNull(telran.string.StringPracticeHw.getCountWords(sent, "  "));
        assertNull(telran.string.StringPracticeHw.getCountWords("  ", "")); */
    }
}