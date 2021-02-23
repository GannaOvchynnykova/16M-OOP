package inherit;

public class Teacher extends Person {
    private double salary;
    private String discipline;
    private String training;

    public Teacher(String firstName, String secondName, String uniID, String dateOfBirth, String gender,
                   String beginWith, String numberMob, String address, int age, double salary, String discipline,
                   String training) {
        super(firstName, secondName, uniID, dateOfBirth, gender,
                beginWith, numberMob, address, age);
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Breakfast 9:00");
    }

    @Override
    void goingTo() {
        super.goingTo();
        System.out.println("I have already come to work");
    }

    void teach() {
        System.out.println("Im teach");
    }

    void advancedTraining() {
        System.out.println("I went to advanced training courses!!!");
    }

    void paymentOfWages(){
        System.out.println("I received salary payment");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", uniID='" + getUniID() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", beginWith='" + getBeginWith() + '\'' +
                ", numberMob='" + getNumberMob() + '\'' +
                ", address='" + getAddress() + '\'' +
                "salary=" + salary +
                ", discipline='" + discipline + '\'' +
                ", training='" + training + '\'' +
                '}';
    }
}
