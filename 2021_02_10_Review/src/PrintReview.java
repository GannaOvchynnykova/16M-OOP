public class PrintReview {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g;
        a = 3;
        b = 5;
        c = 7;
        d = 1;
        e = 15;
        f = 100;
        g = 13;

        int [] myLovelyArray = new int[] {a, b, c, d, e, f, g};

        myPrint(myLovelyArray);
    }

    private static void myPrint(int[] input) {
        for (int each: input) {
            System.out.print(each + " ");
        }
    }

}
