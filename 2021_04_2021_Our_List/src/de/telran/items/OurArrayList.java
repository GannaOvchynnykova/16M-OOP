package de.telran.items;

import de.telran.interfaces.IOurList;

import java.util.Iterator;

//TODO implements this
public class OurArrayList<E> implements IOurList<E> {
    private static final int INITIAL_CAPACITY = 16;
    private Object[] source;
    private int size;

    public OurArrayList(int capacity) {
        source = new Object[capacity];
    }

    public OurArrayList() {
        this(INITIAL_CAPACITY);

    }

    @Override
    public void add(E element) {
        if (source.length == size)
            increaseCapacity();
        source[size] = element;
        size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
        //source = Arrays.copyOf(source, source.length*2);
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) source[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("param pam pam");
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E result = (E) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        source[size - 1] = null;   //source[--size] = null;
        size--;                   // v odny stroky
        return result;
    }

    @Override
    public boolean remove(E element) {
        int index = indexOf(element);
        if (index == -1) return false;
        remove(index);
        return true;
    }

    /**
     * @param element
     * @return the index of element if found, -1 otherwise
     */
    private int indexOf(E element) {
        //consider the case when the
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null)
                    return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(source[i]))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, E element) {
        checkIndex(index);
        source[index] = element;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    //--------------------------------------------------------------------------------------------------

    @Override
    public Iterator<E> backwardIterator() {
        Iterator<E> backwardIterator = new BackwardIterator<>((E[]) source, size);
        return backwardIterator;
    }

    //TODO complete
    private static class BackwardIterator<T> implements Iterator<T> {
        int position;
        T[] source;
        int size;

        public BackwardIterator(T[] source, int size) {
            this.source = source;
            this.size = size;
            position = size-1;
        }

        @Override
        public boolean hasNext() {
            return position >= 0;
        }

        @Override
        public T next() {
            T res = source[position];
            position--;
            return res;
        }
    }

    //--------------------------------------------------------------------------------------------------
     @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new ForwardIterator<>((E[]) source, size);
        return iterator;
    }

    //TODO complete
    private static class ForwardIterator<T> implements Iterator<T> {
        int position;
        T[] source;
        int size;

        public ForwardIterator(T[] source, int size) {
            this.source = source;
            this.size = size;
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public T next() {
            T res = source[position];
            position++;
            return res;
         }
    }
}

