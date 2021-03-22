import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private int min;
    private int max;

    public Range() {
    }

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min <= max)
            this.min = min;
        else
            System.out.println("Set min <= max");
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        if (max >= min)
            this.max = max;
        else
            System.out.println("Set max >= min");
    }

    @Override
    public String toString() {
        return "Range{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(this);
        //return new RangeIteratorRevers(this);
    }
}
