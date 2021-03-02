package de.home.data;

public class Dragon extends Pet {

    public Dragon (String name, int age, String breed, boolean pass, String color){
        super(name, age, breed, pass, color);
    }

    @Override
    void moves() {
        System.out.println("Im dragon an I can dance");
    }

    @Override
    void fly() {
        System.out.println("I can fly Im Dragon!!!");
    }

    @Override
    void eats() {
        System.out.println("Im dragon and I can eat everybody!");

    }

    @Override
    void sleeps() {
        System.out.println("Im dragon and I like to sleep");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
