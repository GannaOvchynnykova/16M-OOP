package de.home.data;

public class Duck extends Pet {
    public Duck(String sort, String name, int age, String breed, boolean pass, String color) {
        super(sort, name, age, breed, pass, color);
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
        System.out.println("Im duck and I can sleep everywhere");
    }

    @Override
    void swim() {
        System.out.println("Im duck and I can swimming");
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
