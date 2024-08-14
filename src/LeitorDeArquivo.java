import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {

    public void lerArquivo(String caminhoDoArquvo) {
        StringBuilder conteudo = new StringBuilder();

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquvo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha).append("\n");
                // System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
        System.out.print(conteudo.toString());
    }
}
