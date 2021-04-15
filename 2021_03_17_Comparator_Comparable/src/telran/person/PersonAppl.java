package telran.person;

import java.util.Arrays;

public class PersonAppl {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1987, "Vasiliy"),
                new Person(1990, "Oleg"),
                new Person(1976, "Marina"),
                new Person(1969, "Ivan"),
                new Person(1986, "Kurt"),
                new Person(1982, "Sophia"),
                new Person(1987, "Erik"),
                new Person(1979, "Mark"),
                new Person(1989, "Lisa"),
                new Person(1982, "Katerina"),
        };
        displayPerson(persons);
        Arrays.sort(persons);
        System.out.println("--------------------------------------------");
        displayPerson(persons);
    }

    private static void displayPerson(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }


}
