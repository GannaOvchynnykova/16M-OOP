package de.andron13.application;

import de.andron13.dao.Pack;
import de.andron13.data.Cat;

public class CatApplication {
    public static void main(String[] args) {
                Cat catchen = new Cat("Barsik", 1, "Pers");
                catchen.move();
                catchen.setName("Daria");
                System.out.println(catchen.isPass());
                System.out.println(catchen.getName());

                Pack mitte = new Pack(20);
                Pack marzan = new Pack(25);
                Pack moskow = new Pack(566);
            }
        }

