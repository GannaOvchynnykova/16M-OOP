import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("--------------------------");
        list.add("Borka");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("------------------------");
        list.add(0, "Oleg");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("--------------------------");
        list.set(0, "Botya");
        System.out.println(list);

        System.out.println("-------------------");
        for (String c: list) {
            System.out.println(c);
        }
        System.out.println("---------------------");
        list.add("Borka");
        System.out.println(list.indexOf("Borka"));
        System.out.println(list.lastIndexOf("Borka"));
        System.out.println(list.contains("Botya"));

        ArrayList<String> temp = new ArrayList<>();
        temp.add("1"); temp.add("2"); temp.add("3");
        list.addAll(temp);
        System.out.println(list);
        list.addAll(1, temp);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.removeAll(temp);
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("--------------------------------------");

        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(123); list2.add(333);
        System.out.println(list2);
    }
}
