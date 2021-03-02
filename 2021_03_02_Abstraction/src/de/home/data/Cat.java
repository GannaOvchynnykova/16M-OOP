package de.home.data;

public class Cat extends Pet {
    public Cat(String name, int age, String breed, boolean pass, String color) {
        super(name, age, breed, pass, color);
    }

    @Override
    void fly() {
        System.out.println("I cant fly, Im Cat!");
    }

    @Override
    public void moves() {
        System.out.println("I cats and i can dance");
    }

    @Override
    public void eats() {
        System.out.println("Im Cat and Im vegetarian");
    }

    @Override
    public void sleeps() {
        System.out.println("Guten Nacht my cats");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}