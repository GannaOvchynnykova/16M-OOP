package de.telran.iterators;

import java.util.Iterator;

public class BackwardIterator<T> implements Iterator<T> {
    private int position;
    private Object[] source;

    public BackwardIterator(T source) {
        this.source = (Object[]) source;
        position = ((Object[]) source).length-1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public T next() {
        return (T) source[position--];
    }
}
