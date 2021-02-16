public class HomeWork2021_02_16 {
    public static void main(String[] args) {
        //Given an array of ints, return true if the array contains no 1’s and no 3’s.
        int [] arr1 = new int[]{0, 2, 4};
        int [] arr2 = new int[]{1, 2, 3};
        int [] arr3 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr1));// → true
        System.out.println(lucky13(arr2));// → false
        System.out.println(lucky13(arr3));// → false
        //Given an array of ints, return true if it contains no 1’s or it contains no 4’s.
        int [] array1 = new int[]{1, 2, 3};
        int [] array2 = new int[]{1, 2, 3, 4};
        int [] array3 = new int[]{2, 3, 4};
        System.out.println(no14(array1));// → true
        System.out.println(no14(array2));// → false
        System.out.println(no14(array3));// → true

        int [] ar1 = fizzArray(4); //{0, 1, 2, 3};
        int [] ar2 = fizzArray(1);
        int [] ar3 = fizzArray(10); //{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        myPrint(ar1);
        myPrint(ar2);
        myPrint(ar3);
    }

    private static int [] fizzArray(int n) {
        int []  output = new int[n];
        for (int i = 0; i < output.length; i++) {
            output[i] = i;
        }
        return output;
    }
    public static void myPrint(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println(array.length-1 + " ]");
    }

    private static boolean no14(int[] input) {
        boolean temp1 = false;
        boolean temp4 = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                temp1 = true;
            } else if (input[i] == 4){
                temp4 = true;
            }
        }
        if (temp1 && temp4){
            return false;
        }
        return true;
    }

    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input [i] == 3){
                return false;
            }
        }
        return true;
    }
}
