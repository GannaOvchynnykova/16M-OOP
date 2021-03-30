package telran.items;

import telran.interfaces.IList;
import telran.iterator.MyArrayIterator;

import java.util.Iterator;

public class MyArray implements IList {
    private static final int INITIAL_SIZE = 16;
    private Object[] array;
    private int size;

    public MyArray(int capacity) {
        array = new Object[capacity];
    }

    public MyArray() {
        // array = new Object[INITIAL_SIZE];
        this(INITIAL_SIZE);
    }

    @Override
    public boolean add(Object obj) {
        if (obj == null) return false;
        if (array.length == size) allocateArray();
        array[size++] = obj;
        return true;
    }

    private void allocateArray() { //sosdaet novii massiv v 2 rasa bolshe starogo no so starimi
        Object[] temp = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
        //array = Arrays.copyOf(array, array.length*2);       - ili tak v odny stroky
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) return null;
        return array[index];
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) return null;
        Object temp = array[index];
        if (index < size - 1) {
            //for (int i = index; i < size - 1; i++) {
            // array[i] = array[i + 1];
            // }
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        array[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    public boolean remove(Object obj) {
        if (obj == null) return false;
        int index = indexOf(obj);
        Object result = remove(index);
        return result != null;
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null) return -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int lastI = -1;
        if (obj == null) return -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) lastI = i;
        }
        // for( int i = size-1; i>=0; i--){
        //if (array[i].equals(obj)) return i;
        return lastI;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj == null) return false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        //Object[] myArray = new Object[size];
        //for (int i = 0; i < size; i++) {
         //   myArray[i] = array[i];
        //}
        //return myArray;
        Object[] myArray = new Object[size];
        System.arraycopy(array, 0, myArray, 0, size);
        return myArray;
    }

    @Override
    public void clear() {
        //for (int i = 0; i < size; i++) {
            //array[i] = null;
        //}
        //size = 0;
        Object [] temp = new Object[0];
        array = temp;
        size = 0;
    }

    @Override
    public Iterator<Object> iterator() {
        return new MyArrayIterator(this);
    }
}
