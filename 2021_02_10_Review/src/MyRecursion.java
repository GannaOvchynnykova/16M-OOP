public class MyRecursion {
    public static void main(String[] args) {
        System.out.println(myFact(6)); //factorial = 6!=6*5*4*3*2*1=720
        myFactRecursion(6);
    }

    private static int myFactRecursion(int number) {
        // yslovie vihoda; basa ;
        // number = number - 1 => number -1 = (number -1) -1
        if (number <=1){
            return 1;
        } else {
            return number * myFactRecursion(number-1);
        }
    }

    private static int myFact(int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result = result * i;
        }
        return result;
    }

}
