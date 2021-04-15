package telran.dto;

public class MeatFood extends Food {
    private int category;

    public MeatFood() {
    }

    public MeatFood(String name, double basicPrice, String company, boolean isKosher, String expDate, double weight, int category) {
        super(name, basicPrice, company, isKosher, expDate, weight);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "category=" + category +
                "} " + super.toString();
    }

    @Override
    public double totalPrice() {
        double price = getBasicPrice() + (getBasicPrice() * category / 100);
        return isKosher() ? price * 1.1 : price;
    }
}
