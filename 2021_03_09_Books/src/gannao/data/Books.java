package gannao.data;

public class Books {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;

    public Books() {
    }

    public Books(long isbn, String author, String title, int countPages, double pricePerPage) {
        this.isbn = isbn;
        setCountPages(countPages);
        setPricePerPage(pricePerPage);

        if (title == null || title.trim().isEmpty()) {
            this.title = "No title";
        } else {
            this.title = title;
        }

        if (author == null || author.trim().isEmpty()) {
            this.author = "No author";
        } else {
            this.author = author;
        }
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if (countPages > 0 && countPages < 10000) {
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

    public double getTotalPriceForOne() {
        return getCountPages() * getPricePerPage();
    }
}

