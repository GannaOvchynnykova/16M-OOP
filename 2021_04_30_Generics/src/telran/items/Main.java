package telran.items;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product <Integer> opel = new Product <> (1, "Opel", 500);
        Product <String> macbook = new Product <> ("apple_id1", "macbook", 600);

        String macbookId = macbook.getId();
        int opelId = opel.getId();

        System.out.println(macbookId);
        System.out.println(opelId);

        //old approach before generics
        List stringList = new ArrayList();

        stringList.add("str1");
        stringList.add("str2");
        stringList.add("str3");
        stringList.add("str4");

        String lastStr = (String) stringList.get(3);

        stringList.add("str5");

        lastStr = (String) stringList.get(4);  //

    }
}

class Product <T> {
    T id;
    String name;
    double price;

    public Product (T id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
