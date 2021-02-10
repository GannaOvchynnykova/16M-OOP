package missingNumber;

public class Solution2 {
    //method return the missing number from range 1 to n
    public int solve (int [] numbers){
        int n = numbers.length + 1;
        int completeSum = n * (n + 1) / 2;
        int incompleteSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            incompleteSum += numbers[i];
        }

        return completeSum - incompleteSum;
    }
}
