public class Celula {
    public Celula prox;
    String operacao;
    int resultado;

    public Celula(String operacao, int resultado) {
        this.operacao = operacao;
        this.resultado = resultado;
        this.prox = null;
    }

    public Celula(String operacao) {
        this.operacao = operacao;
        this.resultado = 0;
        this.prox = null;
    }

}

