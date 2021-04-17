package telran.model;

import telran.dto.Book;
import telran.dto.User;
import telran.interfaces.ILibrary;

import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary {
    private String name; // - название библиотеки
    private String address; //- адресс библиотеки
    private List<User> users; // - коллекция читателей
    private List<Book> books;//- коллекция книг

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.users = new ArrayList<User>();
        this.books = new ArrayList<Book>();
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || books.contains(book))
            return false;
        return books.add(book);
    }

    @Override
    public boolean addUser(User user) {
        if (user == null || users.contains(user))
            return false;
        return users.add(user);
    }

    @Override
    public boolean removeBook(long isbn) {
        Book temp = findByISBN(isbn);
        if (temp != null)
            books.remove(temp);
        return true;
    }

    @Override
    public Book findByISBN(long isbn) {
        for (Book bo : books) {
            if (bo.getIsbn() == isbn)
                return bo;
        }
        return null;
    }

    @Override
    public Object[] getBooksArray() {
       Object [] result = new Object[sizeBook()];
        System.arraycopy(books, 0, result, 0, sizeBook());
        return result;
    }

    @Override
    public List<Book> getBooksArrayPerAuthor(String author) {
        List<Book> result = new ArrayList<Book>();
        for (Book bo : books) {
            if (bo.getAuthor().equals(author))
                result.add(bo);
        }
        return result;
    }

    @Override
    public boolean getBook(User user, String author, String title) {
        //взять книгу...можно если есть такой читатель,
        // если есть такая книга, если книга не помечена как issued==true.
        // Если книга выдана то она помечается как выданная.
        for (User us : users) {
            if (us.equals(user)) {
                for (Book bo : books) {
                    if (bo.getAuthor().equals(author) && bo.getTitle().equals(title) && !bo.isIssued())
                        bo.setIssued(true);
                }
            }
        }
        return false;
    }

    @Override
    public int sizeBook() {
        return books.size();
    }

    @Override
    public int sizeUser() {
        return users.size();
    }

}
