public class Celula {
    public String elemento;
    public Celula prox;
    String operacao;
    int resultado;

    public Celula(String elemento) {
        this.elemento = elemento;
        this.prox = null;
    }

    public Celula(String elemento, Celula prox) {
        this.elemento = elemento;
        this.prox = prox;
    }
}
