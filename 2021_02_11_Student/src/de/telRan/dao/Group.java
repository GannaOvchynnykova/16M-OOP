package de.telRan.dao;

import de.telRan.data.Student;

public class Group {
    public Student[] students;
    public int size;

    public Group(int capasity){ //konstryktor
        students = new Student[capasity];
        size = 0;
    }

    public boolean addStudent (Student student){ // glagol povedenie
        if (size < students.length){
            students[size] = student;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteStudent (Student person){
        //equals
        for (int i = 0; i < size; i++) {
            if (students[i].equals(person)){
                //delete i element
                //peretianyti last element on the empty
                //what to do with last bad element
                //students[i] = null;
                students[i] = students[size-1];
                //students[size -1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
}
