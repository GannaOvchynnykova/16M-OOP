public class HomeWork_gcd_lcm {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(1071, 462)); //наибольший общий делитель
        System.out.println(leastCommonMultiple(16, 20)); //наименьшее общее кратное
    }

    private static int leastCommonMultiple(int n, int m) {

        return n * m / greatestCommonDivisor(16, 20);
    }

    private static int greatestCommonDivisor(int n, int m) {
        while (n != m) {
            if (n > m) {
                n = n - m;

            } else {
                m = m - n;
            }
        }
        return m;
    }
}
