package telran.comporator;

import telran.person.Person2;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person2> {

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
