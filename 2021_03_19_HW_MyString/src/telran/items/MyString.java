package telran.items;

import telran.iterators.MyStringIteratorAscending;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    char[] myString;

    public MyString(String newStr) {
        this.myString = newStr.toCharArray();
    }

    public char[] getMyString() {
        return myString;
    }

    @Override
    public String toString() {
        return new String(myString);
    }

    @Override
    public Iterator<Character> iterator() {
        //return new MyStringIteratorDescending(myString);
      return new MyStringIteratorAscending(myString);
    }
}
