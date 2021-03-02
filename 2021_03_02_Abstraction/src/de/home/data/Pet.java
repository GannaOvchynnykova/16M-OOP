package de.home.data;

abstract class Pet {
    private String sort;
    private String name;
    private int age;
    private String breed;
    private boolean pass;
    private String color;

    public Pet() {
    }

    public Pet(String sort, String name, int age, String breed, boolean pass, String color) {
        this.sort = sort;
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

    abstract void swim();

    @Override
    public String toString() {
        return "Pet{" +
                "sort='" + sort + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", pass=" + pass +
                ", color='" + color + '\'' +
                '}';
    }
}


