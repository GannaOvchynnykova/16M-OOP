package telran.model;

import telran.dto.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class Library {
    private String name; // - название библиотеки
    private String address; //- адресс библиотеки
    private List<String> users; // - коллекция читателей
    private List<Book> books;
    ; //- коллекция книг

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        users = new ArrayList<String>();
        books = new ArrayList<Book>();
    }

    public boolean addBook(Book book) {
        if (book == null || books.contains(book))
            return false;
        return books.add(book);
    }

    public boolean addUser(String user) {
        if (user == null || users.contains(user))
            return false;
        return users.add(user);
    }

    public boolean removeBook(long isbn) {
        Book temp = findByISBN(isbn);
        if (temp != null)
            books.remove(temp);
        return true;
    }

    private Book findByISBN(long isbn) {
        for (Book bo : books) {
            if (bo.getIsbn() == isbn)
                return bo;
        }
        return null;
    }

    public List<Book> getBooksArray() {
        List<Book> result = new ArrayList<Book>();
        for (Book bo : books) {
            result.add(bo);
        }
        return result;
    }

    public List<Book> getBooksArrayPerAuthor(String author) {
        List<Book> result = new ArrayList<Book>();
        for (Book bo : books) {
            if (bo.getAuthor() == author)
                result.add(bo);
        }
        return result;
    }

    public boolean getBook(String user, String author, String title) {
        //взять книгу...можно если есть такой читатель,
        // если есть такая книга, если книга не помечена как issued==true.
        // Если книга выдана то она помечается как выданная.
        for (String s : users) {
            if (s.contains(user)) {
                for (Book bo : books) {
                    if (bo.getAuthor().equals(author) && bo.getTitle().equals(title) && !bo.isIssued())
                        bo.setIssued(true);
                }
            }
        }
        return false;
    }
}
