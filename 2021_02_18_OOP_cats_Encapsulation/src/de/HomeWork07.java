package de;

import java.util.Arrays;

public class HomeWork07 {
    public static void main(String[] args) {
        //Возвращает массив, который «сдвинут влево» на единицу,
        // поэтому {6, 2, 5, 3} возвращает {2, 5, 3, 6}.
        // Вы можете изменить и вернуть данный массив или вернуть новый массив.
        int [] arr1 = new int[]{6, 2, 5, 3}; //2 5 3 6
        int [] arr2 = new int[]{1, 2}; // 2 1
        int [] arr3 = new int[]{1}; //1

        System.out.println(Arrays.toString(shiftLeft(arr1)));
        System.out.println(Arrays.toString(shiftLeft(arr2)));
        System.out.println(Arrays.toString(shiftLeft(arr3)));
    }

    private static int [] shiftLeft(int[] input) {
        int [] output = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        output[output.length-1] = input [0];
        return output;
    }
}
