package de.telRan.application;

import de.telRan.dao.Group;
import de.telRan.data.Student;

public class MyStart {
    public static void main(String[] args) {

        Group group17 = new Group(5);
        Student sasha = new Student("Sasha", "Ivanov", 30);
        System.out.println(group17.addStudent(sasha));
        System.out.println(group17.size);

        Student dasha = new Student("Dasha", "Petrov", 29);
        System.out.println(group17.addStudent(dasha));
        System.out.println(group17.size);

        Student diego = new Student("Diego", "November", 29);
        System.out.println(group17.addStudent(diego));
        System.out.println(group17.size);

        Student masha = new Student("Masha", "Koval", 35);
        System.out.println("Add " + group17.addStudent(dasha));

        System.out.println("Delete " + group17.deleteStudent(sasha));
        System.out.println(group17.size);
        System.out.println(group17.students[0].firstName);

    }
}
