package telran.appl;

import java.util.*;

public class StringCountAppl {
    public static void main(String[] args) {
        String text = "lmn vf lmn b lmn aaaa b aaaa Aaa Bbb";
        displayWordsCount(text);
        System.out.println("--------------------------------");
        displayWordsSortedByCount(text);
    }

    private static void displayWordsSortedByCount(String text) {
        String[] words = getWords(text);
        Map<String, Integer> map = getMapOccurrences(words);
        List<Map.Entry<String, Integer>> listOccurrences = getListOccurrences(map);
        sortListOccurrences(listOccurrences);
        printList(listOccurrences);
    }

    private static void printList(List<Map.Entry<String, Integer>> listOccurrences) {
        for (Map.Entry<String, Integer> e : listOccurrences) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    private static void sortListOccurrences(List<Map.Entry<String, Integer>> listOccurrences) {
        listOccurrences.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int result = o2.getValue() - o1.getValue();
                return result == 0 ? o1.getKey().compareToIgnoreCase(o2.getKey()) : result;
            }
        });
    }

    private static List<Map.Entry<String, Integer>> getListOccurrences(Map<String, Integer> map) {
        return new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
    }

    private static void displayWordsCount(String text) {
        String[] words = getWords(text);
        Map<String, Integer> map = getMapOccurrences(words);
        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    private static Map<String, Integer> getMapOccurrences(String[] words) {
        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        for (String s : words) {
            int count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        return map;
    }

    private static String[] getWords(String text) {
        return text.split(" ");
    }
}
