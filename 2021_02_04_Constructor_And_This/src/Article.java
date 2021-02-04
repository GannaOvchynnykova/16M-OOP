public class Article {
    String title;
    String announce;
    String fullText;
    int id;

    //public Article(){
        //title = "unknown";
        //announce = "Write announce";
        //fullText = "unknown";
    //}
    public Article(String articleTitle, String articleAnnounce){
        title = articleTitle;
        announce = articleAnnounce;
    }
    public Article (int articleId, String articleTitle, String articleAnnounce){
        id = articleId;
        title = articleTitle;
        announce = articleAnnounce;
    }

}
