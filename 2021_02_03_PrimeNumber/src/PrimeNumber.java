public class PrimeNumber {
    public static void main(String[] args) {
        // Dano chislo naiti vse prostie chisla
        findAllPrimeNumber(1000_000);
    }

    private static void findAllPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (primeNumber (i)){
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean primeNumber(int input) {
        int border = (int) Math.sqrt(input);
        for (int i = 2; i < border; i++) {
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }
}
