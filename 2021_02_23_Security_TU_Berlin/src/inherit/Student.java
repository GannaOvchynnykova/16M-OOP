package inherit;

public class Student extends Person {
    private double rating;
    private String lovelyScience;
    static String holidays;

    public Student(){

    }

    public Student(String firstName, String secondName, String uniID, String dateOfBirth, String gender,
                   String beginWith, String numberMob, String address,
                   int age, double rating, String lovelyScience, String holidays) {
        super(firstName, secondName, uniID, dateOfBirth, gender, beginWith, numberMob, address, age);
    }

    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", uniID='" + getUniID() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", beginWith='" + getBeginWith() + '\'' +
                ", numberMob='" + getNumberMob() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age='" + getAge() + '\'' +
                ", rating='" + rating + '\'' +
                ", lovelyScience='" + lovelyScience + '\'' +
                ", holidays='" + holidays + '\'' +
                '}';
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("And dinner in 18;00");
    }

    @Override
    void goingTo() {
        super.goingTo();
        System.out.println("I have already come to work!");
    }

    void study() {
        System.out.println("Im study!!!");
    }

    void exam() {
        System.out.println("I passed the exam!");
    }

    void tuitionFees(){
        System.out.println("I want to tuition Fees");
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLovelyScience() {
        return lovelyScience;
    }

    public void setLovelyScience(String lovelyScience) {
        this.lovelyScience = lovelyScience;
    }

    public static String getHolidays() {
        return holidays;
    }

    public static void setHolidays(String holidays) {
        Student.holidays = holidays;
    }
}
