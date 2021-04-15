package telran.model;

import java.util.TreeSet;

public class Galaxy {
    private String name;
    private TreeSet<Planet> planets;   // for sort and not repeat

    public Galaxy(String name) {
        this.name = name;
        planets = new TreeSet<Planet>();
    }

    public String getName() {
        return name;
        //subset - diapason
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlanet(Planet p) {
        if (p == null) {
            System.out.println("planet is null");
            return;
        }
        planets.add(p);
    }

    public void removePlanet(Planet p) {
        if (p == null) {
            System.out.println("planet is null");
            return;
        }
        planets.remove(p);
    }

    @Override
    public String toString() {
        String str = "Name : " + name;
        str += "\nTotal planets : " + planets.size();
        str += "\n+++++++++++++++++++++++++++++++++++++++\n";
        str += "No.    |Name    |Size   |Time to Earth   \n";
        str += "\n+++++++++++++++++++++++++++++++++++++++\n";
        int count = 1;
        for (Planet pl : planets) {
            str += count + "\t";
            str += pl + "\n";
            count++;
        }
        return str;
    }
}
