
public class Post {
    private String title;
    private String url;
    private String news;
    private String author;
    private String date;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }
    //toString


    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\n' +
                ", url='" + url + '\n' +
                ", news='" + news + '\n' +
                ", author='" + author + '\n' +
                ", date='" + date + '\n' +
                '}';
    }
}
