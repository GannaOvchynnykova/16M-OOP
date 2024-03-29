package telran.model;

import telran.iterators.RangeIterator;

import java.util.Iterator;

public class Range implements Iterable{
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
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(this);
    }
}
