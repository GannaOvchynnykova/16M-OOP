public class Person {
    String firstName;
    String secondName;
    int age;
    String telNumber;
    String passID;

    public Person(){

    }
    public Person (String firstName, int age, int passID){
        this.passID = String.valueOf(passID);
        this.firstName = firstName;
        this.age = age;
    }
}
