package telran.dto;

public abstract class Goods {
    private String name;
    private double basicPrice;
    private String company;
    private boolean isKosher;

    public Goods() {
    }

    public Goods(String name, double basicPrice, String company, boolean isKosher) {
        this.name = name;
        this.basicPrice = basicPrice;
        this.company = company;
        this.isKosher = isKosher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public void setKosher(boolean kosher) {
        isKosher = kosher;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", basicPrice=" + basicPrice +
                ", company='" + company + '\'' +
                ", isKosher=" + isKosher +
                '}';
    }

    public abstract double totalPrice ();
}
