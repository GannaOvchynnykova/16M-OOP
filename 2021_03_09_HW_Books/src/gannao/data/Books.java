package gannao.data;

public class Books {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;

    public Books() {
        author = "No author!";
        title = "No title";
    }

    public Books(long isbn, String author, String title, int countPages, double pricePerPage) {

        setIsbn(isbn);

        if (author != null && !author.trim().isEmpty())
            this.author = author;
        else
            this.author = "No author";

        if (title != null && !title.trim().isEmpty())
            this.title = title;
        else
            this.title = "No title";

        setCountPages(countPages);
        setPricePerPage(pricePerPage);
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

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if (countPages > 0 && countPages <= 10000) {
            this.countPages = countPages;
        } else {
            System.out.println(" Wrong Count of Pages! ");
        }
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0 && pricePerPage < 10) {
            this.pricePerPage = pricePerPage;
        } else {
            System.out.println(" Wrong Price Per Page! ");
        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }

}

