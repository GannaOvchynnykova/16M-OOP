public class Test {
    public static void main(String[] args) { // aplication
        Movie movie1 = new Movie(
                "Titanic",
                "23.87.9999",
                "Kemeron",
                "Columbia",
                "good",
                "comedy",
                5555.89,
                5.5,
                8000,
                300,
                true);

        System.out.println(movie1.toDisplay());

        Movie movie2 = new Movie(
                "Garry Potter",
                "KtoKto",
                "good",
                "comedy",
                8000,
                300);

        Movie[] netflix = new Movie[]{movie1, movie2};

       // Movie.movieArrayGenreToDisplay(netflix, "kinder");
    }
}
