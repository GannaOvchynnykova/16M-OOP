package de.home.data;

abstract class Pet {
    private String name;
    private int age;
    private String breed;
    private boolean pass;
    private String color;

    public Pet() {
    }

    public Pet(String name, int age, String breed, boolean pass, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.pass = pass;
        this.color = color;
    }

    abstract void fly();

    abstract void moves();

    abstract void eats();

    abstract void sleeps();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", pass=" + pass +
                ", color='" + color + '\'' +
                '}';
    }
}


