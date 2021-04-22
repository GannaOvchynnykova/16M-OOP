package telranWithoutInnerNested.appl;

import telranWithoutInnerNested.comparator.ComparatorById;
import telranWithoutInnerNested.items.Person;

import java.util.Set;
import java.util.TreeSet;

public class PersonAppl {
    public static void main(String[] args) {
        Person p1 = new Person(1111, "vasya", "IBM");
        Person p2 = new Person(1234, "Masya", "HP");
        Person p3 = new Person(1001, "Lasya", "Dell");
        Person p4 = new Person(1000, "Gasya", "IBM");
        Person p5 = new Person(4444, "Sasya", "Apple");

        Set<Person> set = new TreeSet<>(new ComparatorById());

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        System.out.println(set);
    }

}
