import java.util.Iterator;

public class RangeIterator implements Iterator <Integer> {
    private Range range;
    private int position;

    public RangeIterator(Range range) {
        this.range = range;
        position = range.getMin();
    }

    @Override
    public boolean hasNext() {
        if (position <= range.getMax())
            return true;
        return false;
    }

    @Override
    public Integer next() {
        Integer i = position;
        position++;
        return i;                //ili tak
        //return position++;     - v odny stroky
    }
}
