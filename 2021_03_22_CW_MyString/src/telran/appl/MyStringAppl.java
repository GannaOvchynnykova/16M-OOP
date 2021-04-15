package telran.appl;

import telran.iterator.MyStringIterator;
import telran.model.MyString;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        MyString ms = new MyString("Make love, not war!");
        System.out.println(ms);

        printMyStringLikeChar(ms);

        deleteChar(ms, 'e');
        printMyStringLikeChar(ms);
    }

    private static void printMyStringLikeChar(MyString ms) {
        for (Character c : ms) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    public static void deleteChar(MyString ms, char ch) {
        Iterator<Character> iter = new MyStringIterator(ms.getStrB());
        while (iter.hasNext()) {
            if (iter.next() == ch) iter.remove();    // ili tak ili 2 strochki
        }
    }
}
