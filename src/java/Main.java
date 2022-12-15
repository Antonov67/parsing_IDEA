
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Post> posts = new ArrayList<>();

        Document doc = Jsoup.connect("https://4pda.to/").get();
        //System.out.println(doc.title());
        //парсинг по аттрибутам
        Elements elements = doc.getElementsByAttributeValue("itemprop","url");
        //foreach
        for(Element element : elements){
            Post post = new Post();
            //System.out.println(element.attr("title"));
            post.setTitle(element.attr("title"));
            String url = element.attr("href");
            //System.out.println(url);
            post.setUrl(url);
            Document news = Jsoup.connect(url).get();
            Elements newsElements = news.getElementsByClass("content-box");
            for (Element element1 : newsElements){
                //System.out.println(element1.text());
                post.setNews(element1.text());
            }
            newsElements = news.getElementsByClass("name");
            for (Element element1 : newsElements){
                //System.out.println(element1.text());
                post.setAuthor(element1.text());
            }
            newsElements = news.getElementsByClass("date");
            for (Element element1 : newsElements){
                //System.out.println(element1.text());
                post.setDate(element1.text());
            }
            posts.add(post);
        }
        System.out.println(posts);

        //парсинг по классу
        elements  = doc.getElementsByClass("post jBfksV");
        //System.out.println(elements);
        for(Element element : elements){
           // System.out.println(element.child(0).getElementsByClass("date").text());

           // System.out.println(element.child(0).getElementsByClass("autor").text());
           // System.out.println(element.child(1).text());
        }
        //

    }
}
