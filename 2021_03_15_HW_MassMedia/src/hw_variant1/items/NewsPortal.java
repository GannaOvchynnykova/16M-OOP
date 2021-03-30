package hw_variant1.items;

public class NewsPortal extends MassMedia {
    String url;

    public NewsPortal(String name, String url) {
        super(name);
        if (url != null && !url.isEmpty())
        this.url = url;
    }

    public NewsPortal() {
        url = "undefined";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url != null && !url.isEmpty())
        this.url = url;
        else System.out.println("Wrong url");
    }

    @Override
    public String toString() {
        return "NewsPortal{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsPortal)) return false;
        NewsPortal that = (NewsPortal) o;
        return getUrl().equals(that.getUrl());
    }

}
