package telran.chislo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxChisloTest {
    List<Integer> numb;
    Integer [] array = {2, 5, 8, 2, 8, 6, 2, 2, 4, 9};

    @org.junit.Before
    public void setUp() throws Exception {
        numb = new ArrayList<>();
        numb.addAll(Arrays.asList(array));
        assertEquals(numb.size(), array.length);
    }

    @Test
    public void testfindRepeatNumb(){
        assertEquals(4, MaxChislo.findRepeatNumb(numb));
    }
}