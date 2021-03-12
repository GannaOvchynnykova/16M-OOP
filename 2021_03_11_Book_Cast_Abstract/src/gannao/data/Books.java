package gannao.data;

public abstract class Books {
    long isbn;
    String author;
    String title;
    int countPages;
    double pricePerPage;

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
        if (pricePerPage > 0.0 && pricePerPage < 10.0) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Books))
            return false;
        Books other = (Books) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (countPages != other.countPages)
            return false;
        if (isbn != other.isbn)
            return false;
        if (Double.doubleToLongBits(pricePerPage) != Double.doubleToLongBits(other.pricePerPage))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    public abstract double calcPrice();
}

