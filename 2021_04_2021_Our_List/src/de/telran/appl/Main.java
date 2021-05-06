package de.telran.appl;

import de.telran.interfaces.IOurList;
import de.telran.items.OurArrayList;

import java.util.Iterator;

public class Main {
    public static void main(String... args) {
        IOurList<String> list = new OurArrayList<>();

        try {
            list.get(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list.add("hello");
        list.add("world");
        list.add("!");

        //System.out.println(list.contains(new String("hello")));

        //this is possible since the list is an object implementing Iterable
        for (String line : list) {
            System.out.println(line);
        }

        //another way to iterate over our list is
        Iterator<String> listIterator =  list.iterator();
        while (listIterator.hasNext()){
            String current = listIterator.next();
            System.out.println(current);
        }

        System.out.println("--------------------------------------------------------------------------");
        Iterator<String> listBackIterator =  list.backwardIterator();
        while (listBackIterator.hasNext()){
            String current = listBackIterator.next();
            System.out.println(current);
        }
    }
}