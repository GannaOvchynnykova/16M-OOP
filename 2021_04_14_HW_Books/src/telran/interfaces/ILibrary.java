package telran.interfaces;

import telran.dto.Book;
import telran.dto.User;

import java.util.List;

public interface ILibrary {
    public boolean addBook(Book book);

    public boolean addUser(User user);

    public boolean removeBook(long isbn);

    public Book findByISBN(long isbn);

    public Object[] getBooksArray();

    public List<Book> getBooksArrayPerAuthor(String author);

    public boolean getBook(User user, String author, String title);

    public int sizeBook();

    public int sizeUser();
}
