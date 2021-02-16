package de.telRan.application;

import de.telRan.data.Student;

public class StartMyLovelyApplication {
    public static void main(String[] args) {
        Student vasyaPypkin = new Student();
        Student sergi = new Student();
        Student varvara = new Student();
        Student adolf = new Student("Adolf", "Adolfofich", 18);

        System.out.println(vasyaPypkin.toDisplay());
        System.out.println();
        System.out.println(adolf.toDisplay());

        Student [] group = new Student[] {vasyaPypkin, sergi, varvara, adolf}; // 1 variant
        System.out.println(group[3].age);

        studentsPrint(group);
    }
    public static void studentsPrint(Student [] group){
        for (int i = 0; i < group.length ; i++) {
            System.out.println(group[i].toDisplay());
        }
    }
}
