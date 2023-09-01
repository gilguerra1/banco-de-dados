import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/F%C3%B3rmula_1").get();

        System.out.println(doc.getElementsByTag("p"));
        System.out.println(doc.getElementsContainingOwnText("o verde para as equipes inglesas, "));
    }
}