public class Movie {
    private String title;
    private String date;
    private String director;
    private String studioName;
    private String announce;
    private String genre;
    private double budget;
    private double rating;
    private int peopleCount;
    private int minutes;
    private boolean subtitles;

    public Movie() {
    }

    public Movie(String genre) {
        this.genre = genre;
    }

    public Movie(String title, String director, String genre, String announce, double budget, int minutes) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.budget = budget;
        this.minutes = minutes;
    }

    public Movie(String title, String date, String director, String studioName, String announce, String genre,
                 double budget, double rating, int peopleCount, int minutes, boolean subtitles) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.studioName = studioName;
        this.announce = announce;
        this.budget = budget;
        this.rating = rating;
        this.peopleCount = peopleCount;
        this.minutes = minutes;
        this.subtitles = subtitles;
    }

    public Movie(String date, String studioName, int peopleCount, boolean subtitles) {
        this.date = date;
        this.studioName = studioName;
        this.peopleCount = peopleCount;
        this.subtitles = subtitles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getAnnounce() {
        return announce;
    }

    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public String toDisplay() {
        return "{ " + "Film " + title + "; Rating " + rating + "; Rejicer "
                + director + "; Dlina " + minutes + "; Price " + budget + "}";
    }

    public static void movieArrayToDisplay(Movie [] films){
        for (int i = 0; i < films.length ; i++) {
            System.out.println(films[i].toDisplay());
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", director='" + director + '\'' +
                ", studioName='" + studioName + '\'' +
                ", announce='" + announce + '\'' +
                ", genre='" + genre + '\'' +
                ", budget=" + budget +
                ", rating=" + rating +
                ", peopleCount=" + peopleCount +
                ", minutes=" + minutes +
                ", subtitles=" + subtitles +
                '}';
    }

    public static void movieArrayGenreToDisplay(Movie [] films, String lovelyGenre){
        for (int i = 0; i < films.length ; i++) {
           // if (films[i].genre.equals("Comedy")){
                if (films[i].genre.equals(lovelyGenre))
                System.out.println(films[i].toDisplay());
            }
        }

    }

