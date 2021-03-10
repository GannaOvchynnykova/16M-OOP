package telran.data;

public class SalesMan extends Employee {
    double totalSales; //продажи
    int bonuse; // %

    public SalesMan() {
    }

    public SalesMan(String name, long id, int age, String company, double baseSalary,
                    double totalSales, int bonuse) {
        super(name, id, age, company, baseSalary);
        this.totalSales = totalSales;
        this.bonuse = bonuse;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getBonuse() {
        return bonuse;
    }

    public void setBonuse(int bonuse) {
        this.bonuse = bonuse;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                ", totalSales=" + totalSales +
                ", bonuse=" + bonuse +
                '}';
    }
}
