package de.telran.interfaces;

public interface IOurList<E> {
    public E get(int index);

    public boolean add(E elt);

    public E remove(int index);

    public boolean remove(E elt);

    public int size();

    public E set(int index, E elt);

    public boolean contains(E elt);

}
