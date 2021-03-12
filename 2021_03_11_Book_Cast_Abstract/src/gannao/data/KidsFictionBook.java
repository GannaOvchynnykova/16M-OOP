package gannao.data;

public class KidsFictionBook extends FictionBook {
    int age;
    int pSubs;

    public KidsFictionBook() {}

    public KidsFictionBook(long isbn, String author, String title, int countPages, double pricePerPage,
                           String genre, boolean isBestSeller,
                           int age, int pSubs) {
        super(isbn, author, title, countPages, pricePerPage, genre, isBestSeller);
        this.age = age;
        this.pSubs = pSubs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getpSubs() {
        return pSubs;
    }

    public void setpSubs(int pSubs) {
        this.pSubs = pSubs;
    }

    @Override
    public String toString() {
        return "KidsFictionBook{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                ", genre='" + genre + '\'' +
                ", isBestSeller=" + isBestSeller +
                ", age=" + age +
                ", pSubs=" + pSubs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KidsFictionBook)) return false;
        if (!super.equals(o)) return false;
        KidsFictionBook book = (KidsFictionBook) o;
        return getAge() == book.getAge() && getpSubs() == book.getpSubs();
    }

    @Override
    public double calcPrice() {
        double result = pricePerPage * countPages * (isBestSeller ? 1.5 : 1);
        return result * (1 - pSubs / 100);
    }
}
