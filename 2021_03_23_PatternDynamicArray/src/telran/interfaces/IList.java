package telran.interfaces;

public interface IList {

    boolean add(Object obj);

    int size();

    Object get(int index);

    Object remove(int index);

    boolean remove(Object obj);

    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    boolean contains(Object obj);

    Object[] toArray();
}
