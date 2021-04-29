package de.telran.dto;

import de.telran.interfaces.IOurList;

import java.util.Arrays;

//TODO implements this
public class OurArrayList<E> implements IOurList<E> {
    private static final int INITIAL_SIZE = 16;
    Object [] source;
    int size;

    public OurArrayList(int capacity) {
        source = new Object[capacity];
    }

    public OurArrayList() {
        this(INITIAL_SIZE);
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) return null;
        return (E) source [index];
    }

    @Override
    public boolean add(E elt) {
        if (elt == null) return false;
        if (source.length == size) allocateArray();
        source[size++] = elt;
        return true;
    }

    private void allocateArray() {
        source = Arrays.copyOf(source, source.length*2);
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        E temp = (E) source[index];
        if (index < size-1){
            System.arraycopy(source, index+1, source, index, size-index-1);
        }
        source[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    public boolean remove(E elt) {
        if (elt == null) return false;
        int index = indexOf(elt);
        E result = remove(index);
        return result != null;
    }

    private int indexOf(E elt) {
        if (elt == null) return -1;
        for (int i = 0; i < size; i++) {
            if (source[i].equals(elt)) return i;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E set(int index, E elt) {
        if (index < 0 || index >= size) return null;
        E old = (E) source[index];
        source[index] = elt;
        return old;

    }

    @Override
    public boolean contains(E elt) {
        if (elt == null) return false;
        for (int i = 0; i < size; i++) {
            if (source[i].equals(elt)) return true;
        }
        return false;
    }

}
