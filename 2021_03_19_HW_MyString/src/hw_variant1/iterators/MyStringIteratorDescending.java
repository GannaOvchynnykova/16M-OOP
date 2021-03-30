package hw_variant1.iterators;

import java.util.Iterator;

public class MyStringIteratorDescending implements Iterator<Character> {
    private char[] myString;
    private int position;

    public MyStringIteratorDescending(char[] myString) {
        this.myString = myString;
        position = myString.length-1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Character next() {
       return myString[position--];
    }
}
