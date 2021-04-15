package telran.iterators;

import telran.model.Range;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private Range range;
    private int position;

    public RangeIterator(Range range){
        this.range = range;
        position = range.getMin();
    }

    @Override
    public boolean hasNext() {
        return position <= range.getMax();
    }

    @Override
    public Integer next() {
        return position++;
    }
}
