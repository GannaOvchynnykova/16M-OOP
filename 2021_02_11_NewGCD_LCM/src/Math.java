public class Math {
    //NOD = 25 i 15 = 5
    public static int euclideanAlgorithm (int a, int b){
        while (a!=b) {
            if (a>b){
                a= a-b;
            } else {
                b = b -a;
            }
        }
        return a;
    }

    public static int euclideanDoWhile(int a, int b) {
        do {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            } while (a != b);
        return a;
    }

    public static int gcdAlgorithmModern(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdRecursion (int a, int b){
        if (b == 0){
            return a;
        }
        return gcdAlgorithmModern(b, a%b);
    }
    public static int leastCommonMulti (int a, int b){
        return a / gcdRecursion(a, b) * b;
    }
}
