package inherit;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;

    public String dateOfBirth;
    private String gender;
    private String beginWith;
    private String numberMob;
    private String address;
    public int age;

    public Person(String firstName, String secondName, String uniID, String dateOfBirth, String gender,
                  String beginWith, String numberMob, String address, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.beginWith = beginWith;
        this.numberMob = numberMob;
        this.address = address;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBeginWith() {
        return beginWith;
    }

    public void setBeginWith(String beginWith) {
        this.beginWith = beginWith;
    }

    public String getNumberMob() {
        return numberMob;
    }

    public void setNumberMob(String numberMob) {
        this.numberMob = numberMob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniID() {
        return uniID;
    }

    void eats() {
        System.out.println("Lanch!!! in 13:00");
    }

    void goingTo () {
        System.out.println("I have already come!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", beginWith='" + beginWith + '\'' +
                ", numberMob='" + numberMob + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
