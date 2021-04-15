package telran.appl;

import java.util.Arrays;

public class NonPredicateAppl {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] oddArray = getOddNumbers(array);
        int [] evenArray = getEvenNumbers(array);
        int [] threeArray = getDivider3Numbers(array);

        displayArray("Odd numbers ", oddArray);
        displayArray("Even numbers ", evenArray);
        displayArray("Three numbers ", threeArray);
    }

    private static void displayArray(String title, int[] array) {
        System.out.println(title);
        System.out.println(Arrays.toString(array));
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }

    private static int[] getDivider3Numbers(int[] array) {
        int size = countThreeNumbers(array);
        int [] result = new int[size];
        int index = 0;
        if (size == 0) return result;
        for (int num : array) {
            if (num % 3 == 0)
                result [index++] = num;
        }
        return result;
    }

    private static int countThreeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 3 == 0)
                count++;
        }
        return count;
    }

    private static int[] getEvenNumbers(int[] array) {
        int size = countEvenNumbers(array);
        int [] result = new int[size];
        int index = 0;
        if (size == 0) return result;
        for (int num : array) {
            if (num % 2 == 0)
                result [index++] = num;
        }
        return result;
    }

    private static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0)
                count++;
        }
        return count;
    }

    private static int[] getOddNumbers(int[] array) {
        int size = countOddNumbers(array);
        int [] result = new int[size];
        int index = 0;
        if (size == 0) return result;
        for (int num : array) {
            if (num % 2 != 0)
                result [index++] = num;
        }
        return result;
    }

    private static int countOddNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0)
                count++;
        }
        return count;
    }
}
