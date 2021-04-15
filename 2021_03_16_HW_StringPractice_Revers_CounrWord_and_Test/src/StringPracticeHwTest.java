import org.junit.Test;

import static org.junit.Assert.*;

public class StringPracticeHwTest {
    String str = "Hello";
    String sent = "Two beers or not two beers";

    @Test
    public void testGetStrReverse() {
        //positiv
        assertEquals("olleH", StringPracticeHw.getStrReverse(str));
        assertEquals("olleH", StringPracticeHw.getStrReverse(str + " "));
        assertEquals("olleH", StringPracticeHw.getStrReverse(" " + str + " "));
        //negativ
        assertNull(StringPracticeHw.getStrReverse(""));
        assertNull(StringPracticeHw.getStrReverse("    "));
        assertNull(StringPracticeHw.getStrReverse(null));
    }

    @Test
    public void testGetCountWords() {
        //positiv
        assertEquals((Integer) 2, StringPracticeHw.getCountWords(sent, "two"));
        assertEquals((Integer) 2, StringPracticeHw.getCountWords(sent, "two "));
        assertEquals((Integer) 2, StringPracticeHw.getCountWords(sent, "beers"));
        assertEquals((Integer) 0, StringPracticeHw.getCountWords(sent, "three"));
        /*assertNull(StringPracticeHw.getCountWords(sent, null));
        assertNull(StringPracticeHw.getCountWords(null, "two"));
        assertNull(StringPracticeHw.getCountWords(null, null));
        assertNull(StringPracticeHw.getCountWords(sent, "  "));
        assertNull(StringPracticeHw.getCountWords("  ", "")); */
    }
}