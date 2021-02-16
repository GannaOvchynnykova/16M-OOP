public class CoctailSort {
    public static void main(String[] args) {
        int [] array = createArray(10);
        int [] myTestArray = new int[20];
        myPrint(array);
        coctailSort(array);
        myPrint(array);

    }

    public static void coctailSort(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i +1];
                    array[i+1] = temp;
                    swap = true;
                }
            }//umenshaem diaposon cikla na edinicy//end - konechnii indeks diaposona
            end--;
            for (int i = end; i > start ; i--) {
                if (array[i] < array[i - 1]){
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swap= true;
                }
            }
            start++;
            if (!swap){
                break;
            }
        }

    }

    public static void myPrint(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println(array.length-1 + " ]");
    }

    public static int[] createArray(int size) {
        int []  output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = (int)(Math.random()* 100);
        }
        return output;
    }
}
