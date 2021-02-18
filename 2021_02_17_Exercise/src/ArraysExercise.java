public class ArraysExercise {
    public static void main(String[] args) {
        //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
        int [] array1 = new int[] {1, 2, 3};
        int [] array2 = new int[] {2, 3, 10};
        int [] array3 = new int[] {2, 3, 5};
        int [] array4 = new int[] {2, 3, 3};

        System.out.println(matchUp(array1, array2));// → 2
        System.out.println(matchUp(array1, array3));// → 3
        System.out.println(matchUp(array1, array4));// → 2
    }

    /**
     * method taks 2 arrays with the same length
     * @param array1
     * @param array2
     * @return
     */
    private static int matchUp(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length ; i++) {
            if (array1[i] != array2[i] && Math.abs(array2[i] - array1[i]) <= 2){
                count++;
            }
        }
        return count;
    }
}
