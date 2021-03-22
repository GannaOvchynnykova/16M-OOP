package telran.items;

import telran.iterators.MyStringIteratorDescending;

import java.util.Arrays;
import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private char[] myString;

    public MyString(String newStr) {
        this.myString = newStr.toCharArray();
    }

    public char[] getMyString() {
        return myString;
    }

    public void setMyString(char[] myString) {
        if (myString != null)
            this.myString = myString;
        else
            System.out.println("One more time");
    }

    @Override
    public String toString() {
        return "MyString{" +
                "myString=" + Arrays.toString(myString) +
                '}';
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIteratorDescending(myString);
    }
}
