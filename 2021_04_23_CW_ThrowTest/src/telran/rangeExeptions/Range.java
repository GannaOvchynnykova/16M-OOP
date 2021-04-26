package telran.rangeExeptions;

public class Range {
    private int min, max;

    public Range (int min, int max){
        if (min > max) throw new RuntimeException("min > max");
        this.min = min;
        this.max = max;
    }

    public void checkNumber (int number) throws NumberLessMinException, NumberGreaterMaxException {
        if (number<min) throw new NumberLessMinException(number + " number < min");
        if (number>max) throw new NumberGreaterMaxException(number + " number > max");
    }
}
