import org.junit.Test;

import static org.junit.Assert.*;

public class StringPracticeHwTest {

    @Test
    public void getStrReverse() {
        System.out.println(StringPracticeHw.getStrReverse("Mama"));


    }

    @Test
    public void getCountWords() {
        System.out.println(StringPracticeHw.getCountWords("Two beers or not two beers", "beers"));
    }
}