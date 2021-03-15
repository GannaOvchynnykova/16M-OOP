package telran.application;

import telran.interfaces.IBarkable;
import telran.interfaces.IChirikable;
import telran.items.Animals;
import telran.items.Cats;
import telran.items.Dog;
import telran.items.Tuki;

public class AnimalsAppl {
    public static void main(String[] args) {
        Animals[] anAr = {
                new Cats("kind of cat", "cats", "Vasilii"),
                new Cats("kind of cat", "cats", "Maria"),
                new Dog("kind of dog", "dogs", "Boss"),
                new Dog("kind of dog", "dogs", "Gera"),
                new Tuki("kind of tuki", "birds", "green", "Gosha"),
                new Tuki("kind of tuki", "birds", "green", "Kesha")
        };
        printAllBarkable(anAr);

        IChirikable a = new Tuki("kind of tuki", "birds", "green", "Gosha");
        // NOT -  IChirikable b = new Dog("kind of dog", "dogs", "Gera");
    }

    private static void printAllBarkable(Animals[] anAr) {
        for (Animals i : anAr) {
            if (i instanceof IBarkable) {
                IBarkable temp = (IBarkable) i;
                temp.bark();
                System.out.println(i);
            }
        }
    }
}
