package telran.iterators;

import java.util.Iterator;

public class MyStringIteratorAscending implements Iterator<Character> {

    char[] myString;
    int position;

    public MyStringIteratorAscending(char[] myString) {
        this.myString = myString;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < myString.length;
    }

    @Override
    public Character next() {
        return myString[position++];
    }
}
