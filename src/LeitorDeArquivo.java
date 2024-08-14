import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {
    public Fila lerArquivo(String caminhoDoArquivo) {
        Fila fila = new Fila();

        //lê um arquivo linha por linha, divide cada linha em substrings e os adiciona a uma fila.
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] tokens = linha.split("\\s+");
                for (String token : tokens) {
                    fila.enfileirar(token);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
        return fila;
    }
}
