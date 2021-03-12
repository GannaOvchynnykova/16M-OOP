package gannao.data;

public class FictionBook extends Books {
    String genre;
    boolean isBestSeller;

    public FictionBook() {
    }

    public FictionBook(long isbn, String author, String title, int countPages, double pricePerPage, String genre, boolean isBestSeller) {
        super(isbn, author, title, countPages, pricePerPage);
        this.genre = genre;
        this.isBestSeller = isBestSeller;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        isBestSeller = bestSeller;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                ", genre='" + genre + '\'' +
                ", isBestSeller=" + isBestSeller +
                '}';
    }
}
