package de.telran.items;

public class Node <E> {
    E element;
    Node prev;
    Node next;

    public Node(E element, Node prev, Node next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
}
