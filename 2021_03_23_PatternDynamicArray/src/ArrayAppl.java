import java.util.Arrays;

public class ArrayAppl {
    public static void main(String[] args) {

        System.out.println("_____________________________________Create array__________________________");

        int[] arI = new int[10];
        System.out.println(arI[0]);

        double[] arD = new double[10];
        System.out.println(arD[9]);

        boolean[] arB = new boolean[10];
        System.out.println(arB[0]);

        String[] arS = new String[10];
        System.out.println(arS[0]);

        System.out.println("_____________________________________initialisation__________________________");

        arI[0] = 100;
        System.out.println(arI[0]);

        System.out.println("_____________________________create_and_initialisation__________________________");

        //1 variant
        int[] arInt = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arInt));

        //2 variant
        int[] ar6;
        ar6 = new int[]{1, 2, 3, 4};

        System.out.println("_______________________________Iterate array___________________________________");

        for (int i = 0; i < arInt.length; i++) {
            System.out.print(arInt[i] + " ");
        }

        for (int i = arInt.length - 1; i > 0; i--) {
            System.out.print(arInt[i] + " ");
        }
        System.out.println();

        System.out.println("_________________________________TEST_____________________");

        int[] test = {9, 2, 8, 1, 7, 5, 3};
        printEvenValue(test);
        System.out.println("___________________________________________________");
        long sum1 = getSumAllElements(test);
        System.out.println(sum1);
        System.out.println("___________________________________________________");
        int startIndex = 1, endIndex = 5;
        long sum2 = getSumOddElementsInRange(test, startIndex, endIndex);
        System.out.println(sum2);
        System.out.println("___________________________________________________");
        String[] strAr = {"123", "22", "10", "12", "3.14"};
        double sum3 = getSumNumbersFromStringArray(strAr);
        System.out.println(sum3);
        System.out.println("__________________________________________________");
        reverseArray(strAr);
        printArray(strAr);
        System.out.println("___________________________________________________");
        int[] test2 = {-9, -2, 8, 1, -7, 5, 3, -12};
        int res = getSumFirstPositivLastPositiv(test2);
        System.out.println(res);
    }

    private static int getSumFirstPositivLastPositiv(int[] test2) {
        /*int firstPositiv = 0;
        int tempLastPositiv = 0;
        for (int i = 0; i < test2.length; i++) {
            if (test2[i] >= 0) firstPositiv = test2[i];
        }
        for (int i = test2.length-1; i > 0; i--) {
              if (test2[i] >= 0) tempLastPositiv = test2[i];
        }
        return firstPositiv+tempLastPositiv; */
        //----------------------------------------------------------------------//
       /* int firstPos = -1, lastPos = -1;
        for (int i = 0; i < test2.length; i++) {
            if (test2[i] >= 0) {
                if (firstPos == -1)
                    firstPos = test2[i];
                lastPos = test2[i];
            }
        }
        return firstPos + lastPos; */
        //----------------------------------------------------------------------//
        int firstPos = -1, lastPos = -1;
        for (int i = 0, j = test2.length - 1; i < test2.length; i++, j--) {
            if (test2[i] >= 0) {
                if (firstPos == -1) firstPos = test2[i];
            }
            if (test2[j] >= 0) {
                if (lastPos == -1) lastPos = test2[j];
            }
            if (firstPos != -1 && lastPos != -1) return firstPos + lastPos;
        }
        return -1;
    }

    private static void printArray(String[] strAr) {
        for (String s : strAr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void reverseArray(String[] strAr) {
        for (int i = strAr.length - 1, j = 0; i > j; i--, j++) {
            String temp = strAr[i];
            strAr[i] = strAr[j];
            strAr[j] = temp;
        }
    }

    private static double getSumNumbersFromStringArray(String[] strAr) {
        double sum = 0;
        for (int i = 0; i < strAr.length; i++) {
            sum += Double.parseDouble(strAr[i]);
        }
        return sum;
    }

    private static long getSumOddElementsInRange(int[] test, int startIndex, int endIndex) {
        long sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (test[i] % 2 != 0) {
                sum += test[i];
            }
        }
        return sum;
    }

    private static long getSumAllElements(int[] test) {
        long sum = 0;
        for (int i = 0; i < test.length; i++) {
            sum += test[i];
        }
        return sum;
    }

    private static void printEvenValue(int[] test) {
        for (int i = 0; i < test.length; i++) {
            if (test[i] % 2 == 0) {
                System.out.print(test[i] + " ");
            }
            System.out.println();
        }
    }
}
