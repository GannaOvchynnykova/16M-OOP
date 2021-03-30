package hw_variant1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] strArr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};
        System.out.println(list.isEmpty());
        list.addAll(Arrays.asList(strArr));
        System.out.println("My first collection - " + list);

        int maxIterations = 100000;
        long timeStamp = System.currentTimeMillis();
        addToTheBeginningArrayList(maxIterations);
        System.out.println("Time ArrayList:  addToTheBeginning:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addToTheBeginningLinkedList(maxIterations);
        System.out.println("Time LinkedList:  addToTheBeginning:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addToTheMiddleArrayList(maxIterations);
        System.out.println("Time ArrayList: addToTheMiddle:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addToTheMiddleLinkedList(maxIterations);
        System.out.println("Time LinkedList: addToTheMiddle:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addToTheEndArrayList(maxIterations);
        System.out.println("Time ArrayList: addToTheEnd:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addToTheEndLinkedList(maxIterations);
        System.out.println("Time LinkedList: addToTheEnd:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        removeTheBeginningArrayList(maxIterations);
        System.out.println("Time ArrayList: removeTheBeginning:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        removeTheBeginningLinkedList(maxIterations);
        System.out.println("Time LinkedList: removeTheBeginning:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        removeTheMiddleArrayList(maxIterations);
        System.out.println("Time ArrayList: removeTheMiddle:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        removeTheMiddleLinkedList(maxIterations);
        System.out.println("Time LinkedList: removeTheMiddle:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        removeTheEndArrayList(maxIterations);
        System.out.println("Time ArrayList: removeTheEnd:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        removeTheEndLinkedList(maxIterations);
        System.out.println("Time LinkedList: removeTheEnd:  " + (System.currentTimeMillis() - timeStamp));
    }

    public static void addToTheBeginningArrayList(int maxIteration) {
        ArrayList<String> list = new ArrayList<String>();
        while (maxIteration > 0) {
            list.add(0, "Kaxa");
            maxIteration--;
        }
    }

    public static void addToTheBeginningLinkedList(int maxIteration) {
        LinkedList<String> list = new LinkedList<>();
        while (maxIteration > 0) {
            list.addFirst("Kaxa");
            maxIteration--;
        }
    }


    public static void addToTheMiddleArrayList(int maxIteration) {
        ArrayList<String> list = new ArrayList<String>();
        while (maxIteration > 0) {
            list.add(list.size() / 2, "Pedro");
            maxIteration--;
        }
    }

    public static void addToTheMiddleLinkedList(int maxIteration) {
        LinkedList<String> list = new LinkedList<>();
        while (maxIteration > 0) {
            list.add(list.size() / 2, "Pedro");
            maxIteration--;
        }
    }

    public static void addToTheEndArrayList(int maxIteration) {
        ArrayList<String> list = new ArrayList<String>();
        while (maxIteration > 0) {
            list.add(list.size(), "Lev");
            maxIteration--;
        }
    }

    public static void addToTheEndLinkedList(int maxIteration) {
        LinkedList<String> list = new LinkedList<>();
        while (maxIteration > 0) {
            list.addLast("Lev");
            maxIteration--;
        }
    }

    public static void removeTheBeginningArrayList(int maxIteration) {
        ArrayList<String> list = new ArrayList<String>();
        while (maxIteration > 0) {
            list.remove(0);
            maxIteration--;
        }
    }

    public static void removeTheBeginningLinkedList(int maxIteration) {
        LinkedList<String> list = new LinkedList<>();
        while (maxIteration > 0) {
            list.removeFirst();
            maxIteration--;
        }
    }

    public static void removeTheMiddleArrayList(int maxIteration) {
        ArrayList<String> list = new ArrayList<String>();
        while (maxIteration > 0) {
            list.remove(list.size() / 2);
            maxIteration--;
        }
    }

    public static void removeTheMiddleLinkedList(int maxIteration) {
        LinkedList<String> list = new LinkedList<>();
        while (maxIteration > 0) {
            list.remove(list.size() / 2);
            maxIteration--;
        }
    }

    public static void removeTheEndArrayList(int maxIteration) {
        ArrayList<String> list = new ArrayList<String>();
        while (maxIteration > 0) {
            list.remove(list.size());
            maxIteration--;
        }
    }

    public static void removeTheEndLinkedList(int maxIteration) {
        LinkedList<String> list = new LinkedList<>();
        while (maxIteration > 0) {
            list.removeLast();
            maxIteration--;
        }
    }
}
