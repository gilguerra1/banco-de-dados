import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class JSOUP {
    public static void main(String[] args) throws IOException{

        Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/F%C3%B3rmula_1").get();

        Elements conteudo = doc.getElementsByTag("h1");

        try {
            FileWriter escritor = new FileWriter("arquivo.txt");
            escritor.write(String.valueOf(conteudo));
            escritor.close();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }


    }
}
