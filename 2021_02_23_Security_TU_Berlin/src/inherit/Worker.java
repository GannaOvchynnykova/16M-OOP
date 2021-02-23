package inherit;

public class Worker extends Person {
    private String vacation;
    private String shift;

    public Worker(){

    }

    public Worker(String firstName, String secondName, String uniID, String dateOfBirth, String gender,
                  String beginWith, String numberMob, String address, String vacation, String shift, int age) {
        super(firstName, secondName, uniID, dateOfBirth, gender,
                beginWith, numberMob, address, age);

    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getVacation() {
        return vacation;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    @Override
    void eats() {
        System.out.println("Not eats!");
    }

    @Override
    void goingTo() {
        super.goingTo();
        System.out.println("I have already come!");
    }

    void works() {
        System.out.println("Im work");
    }

    void ovettimeWork(){
        System.out.println("I love overtime work!");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", uniID='" + getUniID() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", beginWith='" + getBeginWith() + '\'' +
                ", numberMob='" + getNumberMob() + '\'' +
                ", address='" + getAddress() + '\'' +
                "vacation='" + vacation + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}
