package telran.chislo;

import java.util.List;

public class MaxChislo {
    public static int findRepeatNumb(List<Integer> integerList, int number) {
        int count = 0;
        for (Integer i : integerList) {
            if (i.equals(number)) count++;
        }
        return count;
    }
}
