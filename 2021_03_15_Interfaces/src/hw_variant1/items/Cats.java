package hw_variant1.items;

import hw_variant1.interfaces.IMewable;

public class Cats extends Animals implements IMewable {
    String name;

    public Cats() {
    }

    public Cats(String kind, String subspecies, String name) {
        super(kind, subspecies);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void meow() {
        System.out.println("Meow");
    }
}
