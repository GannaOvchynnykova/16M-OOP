package telran.model;

import telran.iterator.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private StringBuffer strB;

    public MyString(String str) {
        this.strB = new StringBuffer(str); //16 capasity
        // strB.append(str);
    }

    public StringBuffer getStrB() {
        return strB;
    }

    public void setStrB(StringBuffer strB) {
        this.strB = strB;
    }

    //crud
    public void addChar(char c) {
        strB.append(c);
    }

    public void removeChar(char c) {
        int index = strB.indexOf(Character.toString(c));
        /* int index = strB.indexOf(String.valueOf(c)); */
        strB.deleteCharAt(index);
    }

    @Override
    public String toString() {
        return strB.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(strB);
    }
}
