package hw_variant1.items;

public class Node {
    Object element;
    Node prev;
    Node next;

    public Node(Object element, Node prev, Node next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
}
