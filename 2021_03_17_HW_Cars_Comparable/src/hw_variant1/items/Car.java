package hw_variant1.items;

public class Car implements Comparable<Car> {
    private int year;
    private String model;
    private String colour;
    private double engine;
    private double price;

    public Car() {
    }

    public Car(int year, String model, String colour, double engine, double price) {
        setYear(year);
        setModel(model);
        setColour(colour);
        setEngine(engine);
        setPrice(price);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0)
            this.year = year;
        else System.out.println("Wrong year");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty())
            this.model = model;
        else System.out.println("Wrong model");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour != null && !model.isEmpty())
            this.colour = colour;
        else System.out.println("Wrong colour");
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine > 0)
            this.engine = engine;
        else System.out.println("Wrong engine");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else System.out.println("Wrong price");
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return model.compareTo(o.model);
    }
}
