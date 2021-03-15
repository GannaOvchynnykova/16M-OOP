package howeWorkBooks;

public class Regal {
    public Books[] books;
    public int size;

    public Regal(int capasity) { //konstryktor
        books = new Books[capasity];
        size = 0;
    }

    public boolean addBooks(Books array) { // glagol povedenie
        if (size < books.length) {
            books[size] = array;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteStudent(Books array) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(books)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }


}


