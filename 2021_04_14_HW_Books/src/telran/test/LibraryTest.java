package telran.test;

import org.junit.Test;
import telran.dto.Book;
import telran.model.Library;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {
    List<String> users;
    String[] usersArr = {"Igor", "Asya", "Galina", "Bibigul", "Feofan", "Fekla"};
    List<Book> books;
    Book [] booksArr = {
            new Book (9784260, false, "Vladimir Dal", "Alphabet"),
            new Book(4964562, false, "Lev Tolstoi", "War and Peace"),
            new Book(7898978, false, "Victor Pelevin", "Generation P"),
            new Book(9895121, false, "Jack Kerouac", "On the roat"),
            new Book(1923780, false, "Friedrich Durrenmat", "Der Besuch der alten Dame"),
            new Book(3043983, false, "Jerome Salinger", "The Catcher in the Rye")
    };
    private Book book1 = new Book(3001988, false, "Jerome Salinger", "The Catcher in the Rye");

    @org.junit.Before
    public void setUp() throws Exception {
        users = new LinkedList<>();
        users.addAll(Arrays.asList(usersArr));
        books = new LinkedList<>();
        books.addAll(Arrays.asList(booksArr));
    }

    @Test
    public void add(){
        assertEquals(books.size(), booksArr.length);
        for (Book bo: booksArr) {
            assertTrue(books.contains(bo));
        }
        assertTrue(books.containsAll(Arrays.asList(booksArr)));

        assertTrue(books.add(book1));
        assertEquals(books.size(), booksArr.length+1);
        assertTrue(books.contains(book1));

        assertTrue(books.add(null));
        assertEquals(books.size(), booksArr.length+2);
        assertTrue(books.contains(null));
//==============================================================
        assertEquals(users.size(), usersArr.length);
        for (String s: usersArr) {
            assertTrue(users.contains(s));
        }
        assertTrue(users.containsAll(Arrays.asList(usersArr)));

        assertTrue(users.add("Anna"));
        assertEquals(users.size(), usersArr.length+1);
        assertTrue(users.contains("Anna"));

        assertTrue(users.add(null));
        assertEquals(users.size(), usersArr.length+2);
        assertTrue(users.contains(null));

        LinkedList<String> usersNew = new LinkedList<String>(Arrays.asList("Karmen", "Marianna", "Ivan"));
        assertTrue(users.addAll(usersNew));
        assertTrue(users.containsAll(usersNew));
        assertEquals(users.size(), usersArr.length+5);
    }

    @Test
    public void remove(){
        assertEquals(false, books.remove(book1));
        assertEquals(true, Library.removeBook(7655443));
    }

    @Test
    public void getBooksArray(){

    }
}