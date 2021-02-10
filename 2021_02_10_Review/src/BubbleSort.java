import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] myLovelyArray = generateArray(10);
        int [] myCopyFromMyLovelyArray = ccopyMyLovely(myLovelyArray);

        System.out.println(Arrays.toString(myLovelyArray));
        buubbleSort(myLovelyArray);


        System.out.println(Arrays.toString(myCopyFromMyLovelyArray));

       // bubbleSortRecursion(myCopyFromMyLovelyArray);

    }

    private static void bubbleSortRecursion(int [] input) {
        int count = 0;
        for (int i = 0; i < input.length-1 ; i++) {
            if (input[i] > input[i - 1]){
                swap(input, i);
                count++;
            }
        }
        if (count > 0){
            bubbleSortRecursion(input);
        }
    }

    private static int[] ccopyMyLovely(int[] myLovelyArray) {
        int [] output = new int [myLovelyArray.length];
        for (int i = 0; i < myLovelyArray.length ; i++) {
            output[i] = myLovelyArray[i];
        }
        return output;
    }

    private static void buubbleSort(int[] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length -1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i);
                }
            }
        }

    }


    private static void swap(int[] input, int i) {
        int temp = input [i];
        input [i] = input [i +1];
        input [i + 1] = temp;
    }


    private static int[] generateArray(int size) {
        int [] output = new int[size];

        for (int i = 0; i < output.length ; i++) {
            output[i] = randomIntGenerate();
        }
            return output;
        }

        private static int randomIntGenerate (){
        return (int) (Math.random() * 100);
    }
}
