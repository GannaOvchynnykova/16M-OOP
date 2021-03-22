import java.util.Iterator;

public class RangeIteratorRevers implements Iterator<Integer> {
    private Range range;
    private int position;

    public RangeIteratorRevers(Range range) {
        this.range = range;
        position = range.getMax();
    }

    @Override
    public boolean hasNext() {
        if (position >= range.getMin())
            return true;
        return false;
    }

    @Override
    public Integer next() {
        return position--;
    }
}
