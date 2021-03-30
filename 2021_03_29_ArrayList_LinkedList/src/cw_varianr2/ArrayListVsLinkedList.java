package cw_varianr2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static final int ITER = 100_000;
    public static final int MIN = 1;    //for random
    public static final int MAX = 9999; //for random

    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        List<Integer> lList = new LinkedList<>();

        long timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(arList, 0, true);
        System.out.println("Ad to begin array list:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(lList, 0, true);
        System.out.println("Ad to begin linked list:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(arList, arList.size() / 2, true);
        System.out.println("Ad to middle array list:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(lList, lList.size() / 2, true);
        System.out.println("Ad to middle linked list:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(arList, arList.size() - 1, true);
        System.out.println("Ad to end array list:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(lList, lList.size() - 1, true);
        System.out.println("Ad to end linked list:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(arList, 0, false);
        System.out.println("Remove begin array list:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(lList, 0, false);
        System.out.println("Remove begin linked list:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(arList, arList.size() / 2, false);
        System.out.println("Remove middle array list:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(lList, lList.size() / 2, false);
        System.out.println("Remove middle linked list:  " + (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(arList, arList.size() - 1, false);
        System.out.println("Remove end array list:  " + (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addOrRemoveToIndex(lList, lList.size() - 1, false);
        System.out.println("Remove end linked list:  " + (System.currentTimeMillis() - timeStamp));
    }

    public static void addOrRemoveToIndex(List<Integer> list, int index, boolean add) {
        if (list == null || index < 0 || index > list.size()) {
            System.out.println("Wrong args. Add ");
            return;
        }
        int count = 0;
        if (add) {
            while (count < ITER) {
                list.add(index, getRandomNumber(MIN, MAX));
                count++;
            }
        } else {
            while (count < ITER) {
                if (index == list.size() - 1)
                    list.remove(index--);
                else
                    list.remove(index);
                count++;
            }
        }
    }

    private static Integer getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
