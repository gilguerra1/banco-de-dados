import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class PersistenciaCsv {
    public static void main(String[] args) {
        String nomeArquivo = "dados.csv";

        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{"Joao", "35", "joao@dicasdejava.com.br"});
        linhas.add(new String[]{"Maria","23","maria@dicasdeprogramacao.com.br"});
        linhas.add(new String[]{"Ana","25","ana@dicasdejava.com.br"});

        try {
            FileWriter escritor = new FileWriter(nomeArquivo);

            for (String[] linha : linhas) {
                escritor.append(String.join(",", linha));
                escritor.append("\n");
            }

            escritor.flush();
            escritor.close();

            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo CSV: " + e.getMessage());
        }
    }
}
