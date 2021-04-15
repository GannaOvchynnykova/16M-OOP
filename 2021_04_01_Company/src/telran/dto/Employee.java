package telran.dto;

public abstract class Employee extends Person {
    String company; //название компани
    double baseSalary; //базовая зарплата в евро

    public Employee() {
        this.company = "Not defined";
    }

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        if (company != null)
            this.company = company;
        else
            this.company = "Not defined!";
        setBaseSalary(baseSalary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null)
            this.company = company;
        else
            System.out.println("Wrong company");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
        else
            System.out.println("Wrong baseSalary");
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

    public abstract double calcSalary();

}
