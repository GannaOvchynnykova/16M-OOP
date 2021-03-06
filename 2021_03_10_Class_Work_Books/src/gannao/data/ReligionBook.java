package gannao.data;

public class ReligionBook extends Books{
    String religion;
    double donation;

    public ReligionBook() {}

    public ReligionBook(long isbn, String author, String title, int countPages, double pricePerPage, String religion, double donation) {
        super(isbn, author, title, countPages, pricePerPage);
        this.religion = religion;
        this.donation = donation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }

    @Override
    public String toString() {
        return "ReligionBook{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                ", religion='" + religion + '\'' +
                ", donation=" + donation +
                '}';
    }
}
