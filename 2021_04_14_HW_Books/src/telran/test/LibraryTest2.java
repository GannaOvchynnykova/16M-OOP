package telran.test;

import org.junit.Before;
import org.junit.Test;
import telran.dto.Book;
import telran.dto.User;
import telran.interfaces.ILibrary;
import telran.model.Library;

import static org.junit.Assert.*;

public class LibraryTest2 {
    ILibrary library;
    ILibrary users;
    Book[] booksArray = {
            new Book(9784260, false, "Vladimir Dal", "Alphabet"),
            new Book(4964562, false, "Lev Tolstoi", "War and Peace"),
            new Book(7898978, false, "Victor Pelevin", "Generation P"),
            new Book(9895121, false, "Jack Kerouac", "On the roat"),
            new Book(1923780, false, "Friedrich Durrenmat", "Der Besuch der alten Dame"),
            new Book(3043983, false, "Jerome Salinger", "The Catcher in the Rye")
    };
    User[] usersArr = {
            new User("Igor", 2435),
            new User("Asya", 7685),
            new User("Galina", 56785),
            new User("Bibigul", 4536),
            new User("Fekla", 7623)
    };

    @Before
    public void setUp() throws Exception {
        library = new Library("VHS Bibliotek", "Prenzlauer Allee 107");
        for (Book bo : booksArray) {
            library.addBook(bo);
        }
        users = new Library("VHS Bibliotek", "Prenzlauer Allee 107");
        for (User us : usersArr) {
            library.addUser(us);
        }
        /*library.addBook(new Book(9784260, false, "Vladimir Dal", "Alphabet"));
        library.addBook(new Book(4964562, false, "Lev Tolstoi", "War and Peace"));
        library.addBook(new Book(7898978, false, "Victor Pelevin", "Generation P"));
        library.addBook(new Book(9895121, false, "Jack Kerouac", "On the roat"));
        library.addBook(new Book(1923780, false, "Friedrich Durrenmat", "Der Besuch der alten Dame"));
        library.addBook(new Book(3043983, false, "Jerome Salinger", "The Catcher in the Rye")); */
    }

    @Test
    public void addBook() {
        assertEquals(6, library.sizeBook());
        for (Book bo : booksArray) {
            long isbn = bo.getIsbn();
            //assertNotNull(library.findByISBN(isbn));
            assertEquals(bo, library.findByISBN(isbn));
        }
        assertTrue(library.addBook(new Book(5043123, false, "Leo Tolstoy", "Anna Karenina")));
        assertEquals(7, library.sizeBook());
    }

    @Test
    public void addUser() {
        assertEquals(5, library.sizeUser());
        assertTrue(library.addUser(new User("Anna", 76123)));
        assertEquals(6, library.sizeUser());
    }

    @Test
    public void removeBook() {
        assertEquals(6, library.sizeBook());
        assertTrue(library.removeBook(3043983));
        assertEquals(5, library.sizeBook());
    }

    @Test
    public void findByISBN() {
        assertTrue(library.findByISBN(3043983) != null);
        assertNotNull(library.findByISBN(3043983));
        assertNull(library.findByISBN(0000000));
    }

    @Test
    public void getBooksArray() {
        Book[] booksArray = {
                new Book(9784260, false, "Vladimir Dal", "Alphabet"),
                new Book(4964562, false, "Lev Tolstoi", "War and Peace"),
                new Book(7898978, false, "Victor Pelevin", "Generation P"),
                new Book(9895121, false, "Jack Kerouac", "On the roat"),
                new Book(1923780, false, "Friedrich Durrenmat", "Der Besuch der alten Dame"),
                new Book(3043983, false, "Jerome Salinger", "The Catcher in the Rye")
        };
        assertArrayEquals(booksArray, library.getBooksArray());
    }

    @Test
    public void getBooksArrayPerAuthor() {
    }

    @Test
    public void getBook() {
    }
}