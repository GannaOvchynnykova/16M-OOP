package telran.iterators;

import telran.model.Range;

import java.util.Iterator;

public class RangeReverseIterator implements Iterator<Integer> {
    private Range range;
    private int position;

    public RangeReverseIterator(Range range) {
        this.range = range;
        position = range.getMax();
    }

    @Override
    public boolean hasNext() {
        return position >= range.getMin();
    }

    @Override
    public Integer next() {
        return position--;
    }
}
