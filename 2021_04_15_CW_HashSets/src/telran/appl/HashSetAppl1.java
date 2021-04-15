package telran.appl;

import telran.items.Cat;

import java.util.*;

public class HashSetAppl1 {
    public static void main(String[] args) {
        HashSet<Cat> catHashSet = new HashSet<>();
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Murzik", 4);
        Cat cat3 = new Cat("Mashka", 3);
        Cat cat4 = new Cat("Botya", 10);
        Cat cat5 = new Cat("Botya", 10);
        catHashSet.addAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
        printSet(catHashSet);
        System.out.println(catHashSet.add(cat5));
        printSet(catHashSet);
        //______________________
        LinkedHashSet<Cat> catLinkedHashSet = new LinkedHashSet<>(Arrays.asList(cat1,cat2,cat3,cat4));
        printSet(catLinkedHashSet);
        //=====================
        TreeSet<Cat> catTreeSet = new TreeSet<Cat>(Arrays.asList(cat1, cat2, cat3, cat4));
        printSet(catTreeSet);
    }

    private static void printSet(Set <Cat> set){
        for (Cat cat : set) {
            System.out.println(cat);
        }
        System.out.println("-------------------------------------");
    }
}
