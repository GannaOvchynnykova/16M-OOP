package telran.iterator;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    private StringBuffer strB;
    private int curPos;
    private int size;

    public MyStringIterator(StringBuffer strB) {
        this.strB = strB;
        curPos = 0;
        //size = strB.capacity(); //polnaia posible dlina
        size = strB.length() - 1;
    }

    @Override
    public boolean hasNext() {
        return curPos <= size;
    }

    @Override
    public Character next() {
        Character current = strB.charAt(curPos);
        curPos++;
        return current;
        //return strB.charAt(curPos++);
    }

    public void remove() {
        //strB.deleteCharAt(strB.codePointBefore(curPos));
        strB.deleteCharAt(--curPos);
        size--;
    }
}
