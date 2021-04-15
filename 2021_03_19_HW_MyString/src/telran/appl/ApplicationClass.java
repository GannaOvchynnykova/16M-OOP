package telran.appl;

import telran.model.MyString;
import telran.iterators.MyStringIteratorDescending;

import java.util.Iterator;

public class ApplicationClass {
    public static void main(String[] args) {
        String newStr = "Make love not war!";
       MyString myString = new MyString(newStr);

       System.out.println(myString);
       printMyStringLikeChar(myString);
       printIteratorDescending(myString);

    }

    private static void printMyStringLikeChar(MyString myString) {
        for (Character c : myString) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    private static void printIteratorDescending(MyString myString){
        Iterator<Character> iterDesc = new MyStringIteratorDescending(myString.getMyString());
        while (iterDesc.hasNext()){
            System.out.print(iterDesc.next()+" ");
        }
        System.out.println();
    }
}
