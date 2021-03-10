package telran.data;

public class Employee extends Person {
    String company; //название компани
    double baseSalary; //базовая зарплата в евро

    public Employee() {
    }

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        this.company = company;
        this.baseSalary = baseSalary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
