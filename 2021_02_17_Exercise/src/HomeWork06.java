public class HomeWork06 {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"
    triangle(6);
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false

        int [] array1 = new int[]{2, 1, 3, 5};
        int [] array2 = new int[]{2, 1, 2, 5};
        int [] array3 = new int[]{2, 4, 2, 5};
        System.out.println(modThree(array1));// → true
        System.out.println(modThree(array2));// → false
        System.out.println(modThree(array3));// → true

        int [] arr = new int[]{5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr, 1));// → false
        System.out.println(sameEnds(arr, 2));// → true
        System.out.println(sameEnds(arr, 3));// → false
    }

    private static boolean sameEnds(int[] arr, int n) {
        boolean result = true;
        for (int i = 0; i < n ; i++) {
            if (arr[i] != arr[((arr.length - n) + i)]){
                result= false;
               break;
            }
        }
        return result;
    }

    private static boolean modThree(int[] input) {
        boolean result = false;
        for (int i = 1; i < input.length - 1; i++) {
            if (input[i - 1] % 2 == 0 && input[i] % 2 == 0 && input[i + 1] % 2 == 0) {
                result = true;
                break;
            }
            if (input[i - 1] % 2 != 0 && input[i] % 2 != 0 && input[i + 1] % 2 != 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean xyzMiddle(String input) {
        for (int i = 0; i < input.length()-2 ; i++) {
            if (input.startsWith("xyz", i)){
                int leftNumber = i;
                int rightNumber = input.length()-(i + 3);
                if (rightNumber - leftNumber <=1){
                    return true;
                }
            }
        }
        return false;
    }

    private static void triangle(int line) {
            for (int i = 1; i <= line; i++) { // kolvo strok
                for (int j = line; j >= i; j--) { // kolvo space
                    System.out.print(" ");
                }
                for (int k = 0; k < (i * 2)-1; k++) { // kolvo *
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }


    private static String repeatFront(String str, int n) {
        String output = "";
        int countLetter = n;
        for (int i = 0; i < n; i++) {
                output += str.substring(0, countLetter);
                countLetter--;
            }
            return output;
        }


}
