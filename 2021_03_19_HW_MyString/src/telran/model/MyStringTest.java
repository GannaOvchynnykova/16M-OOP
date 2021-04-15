package telran.model;

import org.junit.Test;
import telran.iterators.MyStringIteratorAscending;
import telran.iterators.MyStringIteratorDescending;

import static org.junit.Assert.assertEquals;

public class MyStringTest {
    String str = "Hello";
    MyString myString = new MyString(str);
    char[] exAscChar = {'H', 'e', 'l', 'l', 'o'};
    char[] exDesChar = {'o', 'l', 'l', 'e', 'H'};

    @Test
    public void testIterable() {
        assertEquals(exAscChar.length, myString.getMyString().length);
        int index = 0;
        for (char ch : myString) {
            assertEquals(exAscChar[index++], ch);
        }
        assertEquals(exAscChar.length, index);
    }

    @Test
    public void testAscIterator() {
        MyStringIteratorAscending ascIter = new MyStringIteratorAscending(myString.getMyString());
        int index = 0;
        while (ascIter.hasNext()) {
            assertEquals(exAscChar[index++], (char) ascIter.next());
        }
        assertEquals(exAscChar.length, index);
    }

    @Test
    public void testDescIterator() {
        MyStringIteratorDescending descIter = new MyStringIteratorDescending(myString.getMyString());
        int index = 0;
        while (descIter.hasNext()) {
            assertEquals(exDesChar[index++], (char) descIter.next());
        }
        assertEquals(exDesChar.length, index);
    }
}