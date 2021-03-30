package hw_variant1.interfaces;

public interface IList extends Iterable<Object> {

    boolean add(Object obj);

    int size();

    Object get(int index);

    Object remove(int index);

    boolean remove(Object obj);

    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    boolean contains(Object obj);

    Object[] toArray();

    void clear();
}
