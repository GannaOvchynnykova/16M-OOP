package telran.prostoe;

import java.util.ArrayList;
import java.util.List;

public class ProstoeChislo {
    public static void main(String[] args) {
        List<Integer> prost = getPrimeNumb(1000);
        System.out.println(prost);
    }

    private static List<Integer> getPrimeNumb(int n) {
        List<Integer> prost = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (primeNumber (i)){
                prost.add(i);
            }
        }
        return prost;
    }

    private static boolean primeNumber(int input) {
        int border = input;
        for (int i = 2; i < border; i++) {
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }
}
