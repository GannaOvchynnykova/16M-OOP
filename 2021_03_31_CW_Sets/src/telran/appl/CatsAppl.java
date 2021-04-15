package telran.appl;

import telran.model.Cat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CatsAppl {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat("Masha", 4, 'F'),
                new Cat("Boris", 10, 'M'),
                new Cat("Botya", 5, 'F'),
                new Cat("Garfild", 7, 'M'),
                new Cat("Klizma", 1, 'F'),
                new Cat("Honda", 8, 'F'),
                new Cat("Honda", 8, 'F'),
                new Cat("Honda", 8, 'F'),

        };

        HashSet<Cat> catHashSet = new HashSet<Cat>();
        catHashSet.addAll(Arrays.asList(cats));
        //System.out.println(catHashSet);   //ne podhodit tyt
        printCats(catHashSet);
        boolean res = catHashSet.add(new Cat("Boris", 10, 'M'));
        System.out.println(res);
        res = catHashSet.add(null);
        System.out.println(res);
        printCats(catHashSet);

        LinkedHashSet<Cat> catLinkedHashSet = new LinkedHashSet<Cat>(Arrays.asList(cats));
        printCats(catLinkedHashSet);

    }

    private static void printCats(Set<Cat> catHashSet) {
        System.out.println("=========================================");
        for (Cat c: catHashSet) {
            System.out.println(c);
        }
    }
}
