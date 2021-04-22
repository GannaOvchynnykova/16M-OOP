package telranWithInnerNestedClasses.appl;

import telranWithoutInnerNested.items.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonAppl {
    public static void main(String[] args) {
        Person p1 = new Person(1111, "vasya", "IBM");
        Person p2 = new Person(1234, "Masya", "HP");
        Person p3 = new Person(1001, "Lasya", "Dell");
        Person p4 = new Person(1000, "Gasya", "IBM");
        Person p5 = new Person(4444, "Sasya", "Apple");

        //Set<Person> set = new TreeSet<>(new ComparatorById2());
        Set<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        //System.out.println(set);
        print(set);
    }

    private static void print(Set<Person> set) {
        for (Person p : set) {
            System.out.println(p);
        }
    }

    public static class ComparatorById2 implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o2.getId() - o1.getId();
        }
    }

}
