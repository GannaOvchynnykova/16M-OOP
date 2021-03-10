package gannao.application;

import gannao.data.*;

public class BookApplication {
    public static void main(String[] args) {
        Books book1 = new ReligionBook(1234567, "author1", "title1", 569, 0.0, "religion1", 100.0);
        Books book2 = new ReligionBook(1234568, "author2", "title2", 579, 0.0, "religion2", 20.0);
        Books book3 = new FictionBook(1234569, "author3", "title3", 839, 1.0, "genre3", true);
        Books book4 = new KidsFictionBook(1234561, "author4", "title4", 444, 0.9, "genre4", true, 13, 30);
        Books book5 = new EducationBook(7777777, "author5", "title5", 333, 1.89, "subject", 50);

        Books [] books = {book1, book2, book3, book4, book5};

        printBooks(books);

    }

    private static void printBooks(Books[] books) {
        for (Books b: books) {
            System.out.println(b.toString());
        }
    }
}
