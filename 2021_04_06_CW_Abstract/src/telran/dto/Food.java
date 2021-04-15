package telran.dto;

public abstract  class Food extends Goods{
    private String expDate;
    private double weight;

    public Food() {
    }

    public Food(String name, double basicPrice, String company, boolean isKosher, String expDate, double weight) {
        super(name, basicPrice, company, isKosher);
        this.expDate = expDate;
        this.weight = weight;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }


}
