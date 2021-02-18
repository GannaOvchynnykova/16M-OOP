package de.andron13.dao;

import de.andron13.data.Cat;

public class Pack {
    private Cat[] cats;
    private int size;

    public Pack(int capacity){
        cats = new Cat[capacity];
        size = 0;
    }

    public boolean addCat (Cat cat){
        if (size < cats.length){
            cats[size] = cat;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCat (Cat cat){
        for (int i = 0; i < size; i++) {
            if (cats[i].equals(cat)){
                cats[i] = cats[size-1];
                size--;
                return true;
            }
        }
        return false;

    }
}
