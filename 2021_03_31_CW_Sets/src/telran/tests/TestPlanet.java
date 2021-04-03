package telran.tests;

import telran.items.Galaxy;
import telran.items.Planet;

public class TestPlanet {
    public static void main(String[] args) {
        Galaxy gal = new Galaxy("Galaxy Bananas");
        Planet p1 = new Planet("Manky", 12345, 111_000);
        Planet p2 = new Planet("Banan-11", 23456, 100_000);
        Planet p3 = new Planet("G-2", 34567, 90_000);
        Planet p4 = new Planet("Banan-1", 53443, 105_000);
        Planet p5 = new Planet("Mumu-1", 2345, 110_000);
        Planet p6 = new Planet("Manky-2", 9345, 80_000);

        gal.addPlanet(p1);
        gal.addPlanet(p2);
        gal.addPlanet(p3);
        gal.addPlanet(p4);
        gal.addPlanet(p5);
        gal.addPlanet(p6);

        System.out.println(gal);

        gal.addPlanet(new Planet("Manky-3", 9345, 90_000));
        System.out.println(gal);
    }
}
