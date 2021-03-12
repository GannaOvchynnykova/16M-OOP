package gannao.data;

public class EducationBook extends Books {
    String subject;
    int pSubs; // sybsidia % pri pokypke

    public EducationBook() {}

    public EducationBook(long isbn, String author, String title, int countPages, double pricePerPage,
                         String subject, int pSubs) {
        super(isbn, author, title, countPages, pricePerPage);

        this.subject = subject;
        this.pSubs = pSubs;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getpSubs() {
        return pSubs;
    }

    public void setpSubs(int pSubs) {
        this.pSubs = pSubs;
    }

    @Override
    public String toString() {
        /*return super.toString() + ", subject='" + subject + '\'' +
                ", pSubs=" + pSubs +
                '}'; */
        return "EducationBook{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                ", subject='" + subject + '\'' +
                ", pSubs=" + pSubs +
                '}';
    }
}
