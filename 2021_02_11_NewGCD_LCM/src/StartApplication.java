public class StartApplication {
    public static void main(String[] args) {
        System.out.println(Math.euclideanAlgorithm(25, 15));
        System.out.println(Math.euclideanAlgorithm(37, 36));
        System.out.println(Math.euclideanAlgorithm(12, 48));

        System.out.println(Math.euclideanDoWhile(25, 15));
        System.out.println(Math.euclideanDoWhile(37, 36));
        System.out.println(Math.euclideanDoWhile(12, 48));

        System.out.println(Math.gcdAlgorithmModern(25, 15));
        System.out.println(Math.gcdAlgorithmModern(37, 36));
        System.out.println(Math.gcdAlgorithmModern(12, 48));

        System.out.println(Math.gcdRecursion(25, 15));
        System.out.println(Math.gcdRecursion(37, 36));
        System.out.println(Math.gcdRecursion(12, 48));

        System.out.println(Math.leastCommonMulti(25, 15));
        System.out.println(Math.leastCommonMulti(37, 36));
        System.out.println(Math.leastCommonMulti(12, 48));
    }
}
