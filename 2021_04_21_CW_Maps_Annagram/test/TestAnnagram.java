import org.junit.Test;
import telran.dto.Anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAnnagram {
    private String word = "electricity";

    @Test
    public void isAnagramTestTrue() {
        assertTrue(Anagram.isAnagram(word, "electric"));
        assertTrue(Anagram.isAnagram(word, "tric"));
        assertTrue(Anagram.isAnagram(word, "city"));
        assertTrue(Anagram.isAnagram(word, "tet"));
        assertTrue(Anagram.isAnagram(word, "Tet"));
    }

    @Test
    public void isAnagramTestFalse() {
        assertFalse(Anagram.isAnagram(word, " "));
        assertFalse(Anagram.isAnagram(word, "tron"));
        assertFalse(Anagram.isAnagram(word, "ellect"));
        assertFalse(Anagram.isAnagram(word, "toc"));
        assertFalse(Anagram.isAnagram(word, "Toc"));
    }
}
