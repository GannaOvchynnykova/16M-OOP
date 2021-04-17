package telran.appl;

import telran.dto.Computer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputerMain {
    public static void main(String[] args) {

        HashMap<Computer, Double> comps = new HashMap<>();
        Computer comp1 = new Computer("Lenovo", "Intel", 4);
        Computer comp2 = new Computer("Apple", "Pentium Pro", 16);
        Computer comp3 = new Computer("Acer", "Intel", 8);
        Computer comp4 = new Computer("Apple", "Pentium", 4);
        Computer comp5 = new Computer("Asus", "Core i7", 8);

        Double comp01 = 7.88;
        Double comp02 = 5.44;
        Double comp03 = 6.22;
        Double comp04 = 6.89;
        Double comp05 = 8.00;

        comps.put(comp1, comp01);
        comps.put(comp2, comp02);
        comps.put(comp3, comp03);
        comps.put(comp4, comp04);
        comps.put(comp5, comp05);

        System.out.println(comps);
        System.out.println("===============================================");
        Double toWeight = 7.00;
        getСomputersLighter(comps, toWeight);

    }

    private static List<Computer> getСomputersLighter(HashMap<Computer, Double> comps, Double toWeight) {
        List<Computer> result = new ArrayList<>();
        for (Map.Entry<Computer, Double> comp : comps.entrySet()) {
            if (comp.getValue() < toWeight)
                System.out.println(comp.getKey());
            if (comp.getValue() < toWeight)
                System.out.println(comp.getValue());
        }
        return result;
    }
}
