public class ArrayEx {
    public static void main(String[] args) {
        //Return the number of even ints in the given array.
        // Note: the % “mod” operator computes the remainder, e.g. 5 % 2 is 1.
        int [] arr1 = new int[]{2, 1, 2, 3, 4};
        int [] arr2 = new int[]{2, 2, 0};
        int [] arr3 = new int[]{1, 3, 5};
        System.out.println(countEvens(arr1));// → 3
        System.out.println(countEvens(arr2));// → 3
        System.out.println(countEvens(arr3));// → 0
        int [] array1 = new int[]{1, 2, 2, 1};
        int [] array2 = new int[]{1, 1};
        int [] array3 = new int[]{1, 2, 2, 1, 13};
        int [] array4 = new int[]{};
        int [] array5 = new int[]{1, 2, 3, 4, 5, 13, 14, 15, 16};
        int [] array6 = new int[0];
        System.out.println(sum13(array1)); //6
        System.out.println(sum13(array2)); //2
        System.out.println(sum13(array3)); //6
        System.out.println(sum13(array4)); //0
        System.out.println(sum13(array5)); //15
        System.out.println(sum13(array6)); //0

    }

    private static int sum13(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length ; i++) {
            if (input[i] == 13){
                break;
            }
            sum = sum+input[i];
        }
        return sum;
    }

    private static int countEvens(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length ; i++) {
            if (input[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
