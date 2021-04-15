package telran.test;

import org.junit.Test;
import telran.model.MyString;

import static org.junit.Assert.assertEquals;

public class MyStringApplTest {
    MyString ms = new MyString("Hello");
    char[] ex = {'H', 'e', 'l', 'l', 'o'};

    @Test
    public void test() {
        assertEquals(ms.getStrB().length(), ex.length);
        int count = 0;
        for (char c : ms) {
            assertEquals(ex[count++], c);
        }
    }

}