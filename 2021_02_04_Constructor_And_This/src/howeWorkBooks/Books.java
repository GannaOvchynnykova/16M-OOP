package howeWorkBooks;

public class Books {
    String title;
    String ISBN;
    String author;
    int year;
    int numberOfPage;
    String binding;
    String genre;
    double rating;
    double price;

    public Books(String title, String author, String genre, int year){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }
    public Books(int year, int numberOfPage, String binding){
        this.year = year;
        this.numberOfPage = numberOfPage;
        this.binding = binding;
    }
    public Books(double rating, double price){
        this.rating = rating;
        this.price = price;
    }
    public Books(String ISBN){
        this.ISBN = ISBN;
    }


    public Books(int year) {
        this.year = year;
    }
}
