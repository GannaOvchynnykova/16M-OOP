package de.telran.items;

import de.telran.interfaces.IOurList;

import java.util.Comparator;
import java.util.Iterator;

public class OurLinkedList<E> implements IOurList<E> {
    private Node first;    //head
    private Node last;     //tail
    private int size;      //size


    @Override
    public E get(int index) {
        Node node = getNodeByIndex(index);
        return node == null ? null : (E) node.element;
    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public void add(E element) {
        Node newNode = new Node(last, (Node) element, null);
        if (last != null)
            last.next = newNode;
        else
            first = newNode;
        last = newNode;
        size++;
    }

    @Override
    public E remove(int index) {
        Node node = getNodeByIndex(index);
        if (node == null) return null;

        return unlink(node);
    }

    private E unlink(Node node) {
        size--;
        if (node.next == null) {
            last.prev.next = null;
            last = last.prev;
            return (E) node.element;
        }
        if (node.prev == null) {
            first.next.prev = null;
            first = first.next;
            return (E) node.element;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return (E) node.element;
    }

    @Override
    public boolean remove(E element) {
        if (element == null) {
            for (Node x = first; x != null; x = x.next) {
                if (element == x.element)
                    unlink((Node) element);
                return true;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (element.equals(x.element))
                    unlink((Node) element);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, E element) {
        for (Node x = first; x != null; x = x.next) {
            if (x.element == getNodeByIndex(index)) {
                remove((E) x.element);
                add(element);
            }
        }
    }

    @Override
    public boolean contains(E element) {
        if (element == null) {
            for (Node x = last; x != null; x = x.next) {
                if (element == x.element) return true;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (element.equals(x.element)) return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> backwardIterator() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void sort(Comparator<E> comparator) {

    }

    @Override
    public E max(Comparator<E> comparator) {
        return null;
    }

    @Override
    public E min(Comparator<E> comparator) {
        return null;
    }
}
