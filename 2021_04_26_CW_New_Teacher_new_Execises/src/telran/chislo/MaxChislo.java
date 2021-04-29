package telran.chislo;

import java.util.List;

public class MaxChislo {
    public static int findRepeatNumb(List<Integer> integerList) {
        int maxCount = 0;
        int element = 0;
        for (int i = 0; i < integerList.size(); i++) {
            int count = 1;
            for (int j = 0; j < integerList.size(); j++) {
                if (integerList.get(i).equals(integerList.get(j))){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                element = integerList.get(i);
            }
        }
        return element;
    }
}
