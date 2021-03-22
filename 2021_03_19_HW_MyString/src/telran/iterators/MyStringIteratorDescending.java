package telran.iterators;

import java.util.Iterator;

public class MyStringIteratorDescending implements Iterator<Character> {
    private char[] myString;
    private int position;
    private int size;

    public MyStringIteratorDescending(char[] myString) {
        this.myString = myString;
        position = myString.length-1;
        size = myString.length-1;
    }

    @Override
    public boolean hasNext() {
        return position == size;
    }

    @Override
    public Character next() {
        Character current = myString[position--];
        size--;
        return current;
    }
}
