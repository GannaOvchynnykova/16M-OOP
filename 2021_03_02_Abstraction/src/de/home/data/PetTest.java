package de.home.data;

public class PetTest {
    public static void main(String[] args) {
        /* de.home.data.Pet pet = new de.home.data.Pet(); */ //imposible

        Duck duck = new Duck("Duck", "Lera", 2, "Selesen", true, "gold");
        Dog dog = new Dog("Dog","Antonio", 6, "Labrador", true, "black");
        Cat cat = new Cat("Cat","Matilda", 3, "Siam", true, "white");
        Dragon dragon = new Dragon("Dragon", "Zmey Gorynych", 158, "Silver", false, "black");

        dragon.eats();
        dragon.moves();
        dragon.sleeps();
        dragon.fly();
        cat.eats();
        cat.moves();
        cat.sleeps();
        duck.sleeps();
        duck.moves();
        duck.eats();
        duck.fly();
        dog.sleeps();
        dog.moves();
        dog.eats();

        System.out.println(dragon.toString());
        System.out.println(cat.toString());
        System.out.println(duck.toString());
        System.out.println(dog.toString());
    }
}
