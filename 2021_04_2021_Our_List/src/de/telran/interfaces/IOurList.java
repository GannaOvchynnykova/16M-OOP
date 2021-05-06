package de.telran.interfaces;

import java.util.Comparator;
import java.util.Iterator;

public interface IOurList<E> extends Iterable<E> {
    /**
     * the method returns the element by the index
     *
     * @param index
     * @return the element if the index is between 0 und size-1
     * @throws IndexOutOfBoundsException otherwise
     */
    public E get(int index);

    /**
     * adds en element to the list
     *
     * @param element
     * @return
     */
    public void add(E element);

    /**
     * removes the element by the index from the collection
     *
     * @param index
     * @return element to be removed
     * @throws IndexOutOfBoundsException in the index incorrect
     */
    public E remove(int index);

    /**
     * removes the element if found in the collection
     *
     * @param element to remove
     * @return true if found and removed, false otherwise
     */
    public boolean remove(E element);

    /**
     * @return size of the collection
     */
    public int size();

    /**
     * puts the element by the index
     *
     * @param index
     * @param element
     * @throws IndexOutOfBoundsException in the index is incorrect
     */
    public void set(int index, E element);

    /**
     * @param element
     * @return true if the element is found in the collection
     */
    public boolean contains(E element);

    Iterator<E> backwardIterator();

    /**
     * The method must sort this list according to the
     * @param comparator
     */
    public void sort (Comparator<E> comparator);
}
