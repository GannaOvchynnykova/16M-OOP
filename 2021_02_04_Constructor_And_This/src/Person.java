public class Person {
    String firstName;
    String lastName;
    int passportID;
    String date;
    boolean marriageStatus;
    int children;
    String gender; //enum

    public Person(int personID, String personName,
                  String personLN, String personGender,
                  boolean personStatus, int personChildren) {

        firstName = personName;
        lastName = personLN;
        passportID = personID;
        marriageStatus = personStatus;
        children = personChildren;
        gender = personGender;
    }

    public Person(String personName, int personID) {
        firstName = personName;
        passportID = personID;
    }

    public Person(String personName, int personID, String personGender, boolean marriageS) {
        firstName = personName;
        passportID = personID;
        gender = personGender;
        marriageStatus = marriageS;
    }

    public void toDisplay() {
        System.out.println(marriageStatus ? "Intresting" : "NotInteres");
        System.out.println("Gender of User: " + gender);
        System.out.println("Name of User: " + firstName);

    }
}

class PersonTest {
    public static void main(String[] args) {
        try2();
        Person javaCoder = new Person("Ilon", 100, "m", true);
        javaCoder.toDisplay();
    }

    private static void try2() {

    }

    public static void telran() {
        Person student1 = new Person("Ganna", 1);
        System.out.println(student1.firstName);
        Person student2 = new Person("Natalia", 2);
        Person student3 = new Person("Ekaterina", 3);
        Person student4 = new Person("Anastasia", 4);

        Person[] group = new Person[]{student1, student2, student3, student4};
        System.out.println(group[2].firstName);
    }
}
