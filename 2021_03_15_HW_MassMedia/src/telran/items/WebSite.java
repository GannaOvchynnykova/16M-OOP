package telran.items;

public class WebSite extends MassMedia {
    String url;
    String author;

    public WebSite(String name, String url, String author) {
        super(name);
        this.url = url;
        this.author = author;
    }

    public WebSite() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
