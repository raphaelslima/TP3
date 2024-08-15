public class Celula {
    public String convertida;
    public int resultado;
    public Celula proximo;

    public Celula(String convertida, int resultado) {
        this.convertida = convertida;
        this.resultado = resultado;
        this.proximo = null;
    }

    public Celula(String convertida, int resultado, Celula proximo) {
        this.convertida = convertida;
        this.resultado = resultado;
        this.proximo = proximo;
    }
}
