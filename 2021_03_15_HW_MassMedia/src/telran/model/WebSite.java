package telran.model;

public class WebSite extends MassMedia {
    String url;
    String author;

    public WebSite(String name, String url, String author) {
        super(name);
        if (url != null && !url.isEmpty())
            this.url = url;
        if (author != null && !author.isEmpty())
            this.author = author;
    }

    public WebSite() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url != null && !url.isEmpty())
            this.url = url;
        else System.out.println("Wrong url");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty())
            this.author = author;
        else System.out.println("Wrong author");
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WebSite)) return false;
        WebSite webSite = (WebSite) o;
        return getUrl().equals(webSite.getUrl()) && getAuthor().equals(webSite.getAuthor());
    }

}
