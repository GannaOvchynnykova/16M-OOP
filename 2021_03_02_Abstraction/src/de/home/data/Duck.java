package de.home.data;

public class Duck extends Pet {
    public Duck(String name, int age, String breed, boolean pass, String color) {
        super(name, age, breed, pass, color);
    }

    void swims() {
        System.out.println("Im swimming");
    }

    @Override
    void fly() {
        System.out.println("I can fly, Im duck!");
    }

    @Override
    void moves() {
        System.out.println("I can move, I m Duck!");
    }

    @Override
    public void sleeps() {
    }

    @Override
    public void eats() {
        System.out.println("One more eats");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
