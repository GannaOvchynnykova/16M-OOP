import org.junit.Test;

import static org.junit.Assert.*;

public class StringPracticeHwTest {

    @Test
    public void testGetStrReverse() {
        //positiv
        assertEquals("amaM", StringPracticeHw.getStrReverse("Mama"));
        assertEquals("amam", StringPracticeHw.getStrReverse("mama"));
        assertEquals(" amaM", StringPracticeHw.getStrReverse("Mama "));
        //negativ
        assertNull(StringPracticeHw.getStrReverse(""));
        assertNull(StringPracticeHw.getStrReverse("    "));
        assertNull(StringPracticeHw.getStrReverse(null));
    }

    @Test
    public void testGetCountWords() {
        //positiv
        String input = "Two beer or not two beer Beer";
        String word = "beer";
        assertEquals(2, StringPracticeHw.getCountWords(input, word));
        //assertEquals(1, StringPracticeHw.getCountWords(input, "Beer"));
        assertEquals(0, StringPracticeHw.getCountWords(input, "Hello"));
        assertEquals(2, StringPracticeHw.getCountWords(input, " beer"));
        //negativ
        assertEquals(-1, StringPracticeHw.getCountWords(input, null));
        assertEquals(-1, StringPracticeHw.getCountWords(null, "Beer"));
        assertEquals(-1, StringPracticeHw.getCountWords(null, null));
        assertEquals(-1, StringPracticeHw.getCountWords("", "beer"));
        assertEquals(-1, StringPracticeHw.getCountWords(input, ""));
        assertEquals(-1, StringPracticeHw.getCountWords("", ""));
        assertEquals(-1, StringPracticeHw.getCountWords("  ", "beer"));
        assertEquals(-1, StringPracticeHw.getCountWords(input, "     "));
        assertEquals(-1, StringPracticeHw.getCountWords("    ", "   "));
    }
}