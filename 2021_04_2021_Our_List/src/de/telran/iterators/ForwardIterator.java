package de.telran.iterators;

import java.util.Iterator;

public class ForwardIterator <T> implements Iterator<T> {
    private int position;
    private Object[] source;

    public ForwardIterator(T source) {
        this.source = (Object[]) source;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < source.length;
    }

    @Override
    public T next() {
        return (T) source[position++];
    }
}
