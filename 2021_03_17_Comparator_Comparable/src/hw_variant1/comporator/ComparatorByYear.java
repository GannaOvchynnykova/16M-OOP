package hw_variant1.comporator;

import hw_variant1.person.Person2;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Person2> {

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getBirthYear() - o2.getBirthYear();
    }
}
