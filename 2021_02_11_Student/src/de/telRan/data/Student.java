package de.telRan.data;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public double middleRating;

    static int count = 1;
    public int studentID;

    public Student(){
        studentID = count;
        count++;
    }

    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        studentID = count;
        count++;
    }
    public String toDisplay(){

        return "Exempl class student {" + " Name: " + firstName
                + "; Last Name: " + lastName
                + "; Age: " + age + "; Middle rating: " + middleRating + "; ID: " + studentID + " }";
    }
}
