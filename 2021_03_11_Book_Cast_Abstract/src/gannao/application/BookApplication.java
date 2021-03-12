package gannao.application;

import gannao.data.*;

public class BookApplication {
    public static void main(String[] args) {
        Books book1 = new ReligionBook(1234567, "author1", "title1", 569, 0.1, "religion1", 100.0);
        Books book2 = new ReligionBook(1234568, "author2", "title2", 579, 0.1, "religion2", 20.0);
        Books book3 = new FictionBook(1234569, "author3", "title3", 839, 1.0, "genre3", true);
        Books book4 = new KidsFictionBook(1234561, "author4", "title4", 444, 0.9, "genre4", true, 13, 30);
        Books book6 = new KidsFictionBook(1234561, "author6", "title6", 444, 0.9, "genre4", true, 12, 30);
        Books book5 = new EducationBook(7777777, "author5", "title5", 333, 1.89, "subject", 50);

        Books[] books = {book1, book2, book3, book4, book5, book6};

        printBooks(books);

        KidsFictionBook kfb = (KidsFictionBook) book4;
        System.out.println(kfb.getAge());

        //__________________!Wrong!___________
        //KidsFictionBook kfb2 = (KidsFictionBook) book2;
        //KidsFictionBook kfb2 = (KidsFictionBook) book3;

        System.out.println(book4 instanceof KidsFictionBook);
        System.out.println(book2 instanceof KidsFictionBook);
        System.out.println(book3 instanceof KidsFictionBook);
        System.out.println(book4 instanceof FictionBook);

        //finde all >10 years KidsFiction
        int age = 10;
        int result = countChildBookWithAgeGreater(age, books);
        System.out.println("Count = " + result);

        Books test = new KidsFictionBook(1234561, "author4", "title4", 444,
                0.9, "genre4", true, 13, 30);

        boolean resultB = searchBook(books, test);
        System.out.println(resultB);

    }

    private static boolean searchBook(Books[] books, Books test) {
        for (Books book : books) {
            if (book.equals(test)) return true;
        }
        return false;
    }

    private static int countChildBookWithAgeGreater(int age, Books[] books) {
        int count = 0;
        for (Books book : books) {
            if (book instanceof KidsFictionBook) {
                KidsFictionBook temp = (KidsFictionBook) book;
                if (temp.getAge() > age) count++;
            }
        }
        return count;
    }

    private static void printBooks(Books[] books) {
        for (Books b : books) {
            System.out.println(b.toString());
            System.out.println("Price : " + b.calcPrice());
        }
    }
}
