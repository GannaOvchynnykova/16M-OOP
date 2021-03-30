package hw_variant1.person;

import hw_variant1.comporator.ComparatorByName;
import hw_variant1.comporator.ComparatorByYear;

import java.util.Arrays;
import java.util.Comparator;

public class Person2Appl {
    public static void main(String[] args) {
        Person2[] persons = {
                new Person2(1987, "Vasiliy"),
                new Person2(1990, "Oleg"),
                new Person2(1976, "Marina"),
                new Person2(1969, "Ivan"),
                new Person2(1986, "Kurt"),
                new Person2(1982, "Sophia"),
                new Person2(1987, "Erik"),
                new Person2(1979, "Mark"),
                new Person2(1989, "Lisa"),
                new Person2(1982, "Katerina"),
        };
        displayPerson(persons);
        System.out.println("----------------------------------");
        Comparator <Person2> comp = new ComparatorByYear();
        Arrays.sort(persons, comp);
        displayPerson(persons);
        System.out.println("------------------------------------");
        Arrays.sort(persons, new ComparatorByName());
        displayPerson(persons);
    }

    private static void displayPerson(Person2[] persons) {
        for (Person2 p : persons) {
            System.out.println(p);
        }
    }
}
