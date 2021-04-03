import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 7, 11, 17, 0};

        //---------------------------Slojnosti yrovni-----------------------

        // O(1)
        double mid = (arr[0] + arr.length-1)/2.;


        // O(n)          // search
        int sum = 0;
        for (int num: arr) {
            sum+=sum;
        }

        //O(log(n))
        int index = Arrays.binarySearch(arr, 17);

        //O(n^2)                    sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }


        //O(n*log(n))
        Arrays.sort(arr);
    }
}
