package telran.appl;

import telran.model.EvenPredicate;
import telran.model.OddPredicate;
import telran.model.ThreePredicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateAppl {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] oddArray = getNumbers(array, new OddPredicate());
        int[] evenArray = getNumbers(array, new EvenPredicate());
        int[] threeArray = getNumbers(array, new ThreePredicate());

        displayArray("Odd numbers ", oddArray);
        displayArray("Even numbers ", evenArray);
        displayArray("Three numbers ", threeArray);
    }

    private static int[] getNumbers(int[] array, Predicate<Integer> predicate) {
        int size = countNumbers(array, predicate);
        int[] result = new int[size];
        int index = 0;
        if (size == 0) return result;
        for (int num : array) {
            if (predicate.test(num))
                result[index++] = num;
        }
        return result;
    }

    private static int countNumbers(int[] array, Predicate<Integer> predicate) {
        int count = 0;
        for (int num : array) {
            if (predicate.test(num))
                count++;
        }
        return count;
    }

    private static void displayArray(String title, int[] array) {
        System.out.println(title);
        System.out.println(Arrays.toString(array));
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}
