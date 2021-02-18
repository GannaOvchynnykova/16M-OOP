import java.util.Arrays;

public class Snowflake_Solution {
    public static void main(String[] args) {
        String [][] array = winter(10);
        myPrintTwoArray(array);
    }

    private static void myPrintTwoArray(String [][] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static String [][] winter(int size) {
        String [][] output;
        if (size % 2 == 0){
            output = new String[size+1][size+1];
        } else {
            output = new String[size][size];
        }
        fillArray(output, 'X');
        return output;
    }

    private static void fillArray(String[][] output, char element) {
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length; j++) {
                output[i][j] = " ";
            }
        }
        for (int i = 0; i < output.length ; i++) {
                output [i][output.length/2] = String.valueOf(element);
        }
        for (int i = 0; i < output.length ; i++) {
                output[output.length/2] [i] = String.valueOf(element);
        }
        for (int i = 0; i < output.length/2 ; i++) {
            for (int j = 0; j < output.length/2 ; j++) {
                if (i == j){
                    output[i][j] = String.valueOf(element);
            }
            }
        }
        for (int i = 0; i < output.length ; i++) {
            for (int j = 0; j < output.length ; j++) {
                if (i + j == output.length -1){
                    output [i][j] = String.valueOf(element);
            }
        }
        }

        }
}
