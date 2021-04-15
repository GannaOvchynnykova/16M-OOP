package telran.appl;

import telran.iterators.RangeReverseIterator;
import telran.model.Range;

import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        int[] ar = {5, 8, 2, 9, 0};
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = -10, max = 10;
        Range range = new Range(min, max);
        for (Object num : range) {
            System.out.print(num + " ");
        }
        System.out.println();

        Iterator<Integer> iter = new RangeReverseIterator(range);
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }
}
