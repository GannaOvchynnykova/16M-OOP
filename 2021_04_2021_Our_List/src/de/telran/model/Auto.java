package de.telran.model;

import java.util.Iterator;
import java.util.Objects;

//TODO create a comparator comparator by price
//TODO test list for sort, max and min operations with Auto objects using the comparator from above.
public class Auto implements Comparable<Auto>, Iterator<Auto> {
    private String make;
    private String color;
    private long price;

    public Auto(String make, String color, long price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return getPrice() == auto.getPrice() && getMake().equals(auto.getMake()) && getColor().equals(auto.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getColor(), getPrice());
    }

    @Override
    public int compareTo(Auto o) {
        return Long.compare(price, o.price);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Auto next() {
        return null;
    }
}
