package telran.dto;

public class MilkFood extends Food {
    String milkType;
    String productType;

    public MilkFood() {
    }

    public MilkFood(String name, double basicPrice, String company, boolean isKosher, String expDate, double weight, String milkType, String productType) {
        super(name, basicPrice, company, isKosher, expDate, weight);
        this.milkType = milkType;
        this.productType = productType;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", productType='" + productType + '\'' +
                "} " + super.toString();
    }

    @Override
    public double totalPrice() {
        return isKosher() ? getBasicPrice() * 1.1 : getBasicPrice();
    }
}
