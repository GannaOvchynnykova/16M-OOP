package telran.items;

import telran.interfaces.IList;

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
        array[size--] = obj;
        return true;
    }

    @Override
    public int indexOf(Object obj) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == obj) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int lastIndexOf = size - 1;
        for (int i = 1; i < size; i++) {
            if (i == lastIndexOf) {
            }
        }
        return lastIndexOf;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
