package telran.data;

public class SalesMan extends Employee {
    double totalSales; //продажи
    int bonuse; // %

    public SalesMan() {
    }

    public SalesMan(String name, long id, int age, String company, double baseSalary,
                    double totalSales, int bonuse) {
        super(name, id, age, company, baseSalary);
        setTotalSales(totalSales);
        setBonuse(bonuse);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales > 0)
            this.totalSales = totalSales;
        else
            System.out.println("Wrong totalSales");
    }

    public int getBonuse() {
        return bonuse;
    }

    public void setBonuse(int bonuse) {
        if (bonuse > 0)
            this.bonuse = bonuse;
        else
            System.out.println("Wrong bonuse");
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

    @Override
    public double calcPrice() {
        return baseSalary + ((totalSales / 100) * bonuse);
    }
}
