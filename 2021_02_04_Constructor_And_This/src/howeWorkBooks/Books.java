package howeWorkBooks;

public class Books {
    public String title;
    public String ISBN;
    public String author;
    public int year;
    public int numberOfPage;
    public String binding;
    public String genre;
    public double rating;
    public double price;


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
    public String toDisplay(){

        return "Example class books {" + " Author: " + author
                + "; Name: " + title
                + "; Age: " + year + "; Middle rating: " + rating + "; Genre " + genre + " }";
    }
}
