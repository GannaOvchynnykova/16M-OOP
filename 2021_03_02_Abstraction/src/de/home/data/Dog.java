package de.home.data;

public class Dog extends Pet {
    public Dog(String name, int age, String breed, boolean pass, String color) {
        super(name, age, breed, pass, color);
    }

    @Override
    void fly() {
        System.out.println("I cant fly, Im Dog!");
    }

    @Override
    public void moves() {
        System.out.println("I can run, im dog!");

    }

    @Override
    public void eats() {
        System.out.println("Im dog and I want to eat you!");
    }

    @Override
    public void sleeps() {
        System.out.println("Dog Never sleeps");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
