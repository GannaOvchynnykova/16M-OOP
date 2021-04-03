package telran.dto;

public class Manager extends Employee {
    int grade; //позиционный уровень(в диапазоне от 1-4)

    public Manager() {
    }

    public Manager(String name, long id, int age, String company, double baseSalary, int grade) {
        super(name, id, age, company, baseSalary);
        setGrade(grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 5)
            this.grade = grade;
        else
            System.out.println("Wrong grade");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                ", grade=" + grade +
                '}';
    }

    @Override
    public double calcPrice() {
        return baseSalary * grade;
    }

}
