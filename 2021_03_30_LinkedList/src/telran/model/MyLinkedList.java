package telran.model;

import telran.interfaces.IList;

import java.util.Iterator;

public class MyLinkedList implements IList {
    private Node first;    //head
    private Node last;     //tail
    private int size;      //size


    @Override
    public boolean add(Object element) {
        Node newNode = new Node(last, (Node) element, null);
        if (last != null)
            last.next = newNode;
        else
            first = newNode;
        last = newNode;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        Node node = getNodeByIndex(index);
        return node == null ? null : node.element;
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
    public Object remove(int index) {
        Node node = getNodeByIndex(index);
        if (node == null) return null;

        return unlink(node);
    }

    private Object unlink(Node node) {
        size--;
        if (node.next == null) {
            last.prev.next = null;
            last = last.prev;
            return node.element;
        }
        if (node.prev == null) {
            first.next.prev = null;
            first = first.next;
            return node.element;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node.element;
    }

    @Override
    public boolean remove(Object obj) {
        if (obj == null) {
            for (Node x = first; x != null; x = x.next) {
                if (obj == x.element)
                    unlink((Node) obj);
                return true;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.element))
                    unlink((Node) obj);
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        int index = 0;
        if (obj == null) {
            for (Node x = first; x != null; x = x.next) {
                if (obj == x.element) return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.element)) return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int lastIndex = size;
        if (obj == null) {
            for (Node x = last; x != null; x = x.prev) {
                lastIndex--;
                if (obj == x.element) return lastIndex;
            }
        } else {
            for (Node x = first; x != null; x = x.prev) {
                lastIndex--;
                if (obj.equals(x.element)) return lastIndex;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj == null) {
            for (Node x = last; x != null; x = x.next) {
                if (obj == x.element) return true;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.element)) return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = first; x != null; x = x.next) {
            result[i++] = x.element;
        }
        return result;
    }

    @Override
    public void clear() {
        for (Node x = first; x != null; ) {
            Node next = x.next;
            x.element = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
