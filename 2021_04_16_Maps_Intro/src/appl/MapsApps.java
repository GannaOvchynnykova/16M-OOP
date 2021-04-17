package appl;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsApps {
    public static void main(String[] args) {

        //HashMap<String, Integer> des = new HashMap<>();
        LinkedHashMap<String, Integer> des = new LinkedHashMap<>();

        String roomer1 = "Vasya Pupkin";
        int room = 10;
        String roomer2 = "Petya Pupkin";
        String roomer3 = "Mariya Fleisher";
        int room2 = 11;

        System.out.println(des.put(roomer1, room));
        System.out.println(des.put(roomer2, room));
        System.out.println(des.put(roomer3, room2));
        System.out.println(des);

        System.out.println(des.size());
        for (String roomer : des.keySet()) {
            System.out.println(roomer);
        }

        HashSet<Integer> rooms = new HashSet<>();
        for (Integer roo : des.values()) {
            rooms.add(roo);
        }
        System.out.println(rooms);

        des.put(roomer3, 10);
        getRoomers(des, room);
        System.out.println(des.containsKey(roomer1));
        System.out.println(des.containsValue(room2));
        System.out.println(des.remove(roomer2));
        System.out.println(des);
        System.out.println(des.remove(roomer1, room));
        System.out.println(des);
        System.out.println(des.putIfAbsent(roomer3, 100));
        System.out.println(des);
    }

    private static void getRoomers(LinkedHashMap<String, Integer> des, int room) {
        for (Map.Entry<String, Integer> e : des.entrySet()) {
            if (e.getValue() == room) System.out.println(e.getKey());
        }
    }
}
