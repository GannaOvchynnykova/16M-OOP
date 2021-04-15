package telran.dto;

public class Book {
    long isbn;// - уникальный номер
    boolean issued; // - выдано на руки
    String author; // - автор
    String title; // - название

    public Book() {
    }

    public Book(long isbn, boolean issued, String author, String title) {
        setIsbn(isbn);
        setIssued(issued);
        if (author != null && !author.trim().isEmpty())
            this.author = author;
        else
            this.author = "No author";
        if (title != null && !title.trim().isEmpty())
            this.title = title;
        else
            this.title = "No title";
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if (isbn > 999_999 && isbn < 10_000_000)
            this.isbn = isbn;
        else
            System.out.println("Wrong isbn!");
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty())
            this.author = author;
        else
            System.out.println("Wrong author!!!");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty())
            this.title = title;
        else
            System.out.println("Wrong title!!!");
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", issued=" + issued +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
