package telran.rangeExeptions;

public class RangeTestAppl {
    private static final int MIN_RANGE = 100;
    private static final int MAX_RANGE = 1000;
    private static final int N_NUMBERS = 20_000;
    private static final int MIN_NUMBER = 20;
    private static final int MAX_NUMBER = 1500;

    public static void main(String[] args) {
        Range range = new Range(MIN_RANGE, MAX_RANGE);
        int countRight = 0;
        int countLess = 0;
        int countGreater = 0;

        for (int i = 0; i < N_NUMBERS; i++) {
            int number = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            try {
                range.checkNumber(number);
                countRight++;
            } catch (NumberLessMinException e) {
                countLess++;
                e.printStackTrace();
            } catch (NumberGreaterMaxException e) {
                countGreater++;
                e.printStackTrace();
            }
        }
        System.out.printf("countRight = %d, countLess = %d, countGreater = %d\n", countRight, countLess, countGreater);
    }

    private static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (minNumber + Math.random() * (maxNumber - minNumber + 1));
    }
}
