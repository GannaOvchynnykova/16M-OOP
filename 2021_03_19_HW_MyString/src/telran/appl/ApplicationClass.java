package telran.appl;

import telran.items.MyString;

public class ApplicationClass {
    public static void main(String[] args) {
       MyString myString = new MyString("Make love not war!");
       System.out.println(myString);

       printMyStringLikeChar(myString);
    }

    private static void printMyStringLikeChar(MyString myString) {
        for (Character c : myString) {
            System.out.print(" " + c);
        }
        System.out.println();
    }
}
