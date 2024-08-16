public class Fila {
    public int tamanho;
    public Celula frente;
    public Celula tras;

    Fila() {
        this.frente = new Celula("-1", -1); // Inicializa com um valor inválido
        this.tras = frente;
        this.tamanho = 0;
    }

    public boolean vazia() {
        return this.frente == this.tras;
    }

    public void enfileirar(String convertida, int resultado) {
        Celula celula = new Celula(convertida, resultado);
        if (this.frente == this.tras) {
            this.frente.proximo = celula;
            this.tras = celula;
        } else {
            this.tras.proximo = celula;
            this.tras = celula;
        }

        this.tamanho++;
    }

    public Celula desenfileirar() {
        if (this.vazia()) {
            System.out.println("Fila vazia.");
            return null;
        } else {
            Celula aux = this.frente.proximo;
            this.frente.proximo = aux.proximo;
            aux.proximo = null;
            if (aux == this.tras) {
                this.tras = this.frente;
            }

            this.tamanho--;

            return aux;
        }
    }

    public void imprimir() {
        if (this.vazia()) {
            System.out.println("Fila vazia.");
        } else {
            Celula aux = this.frente.proximo;
            while (aux != null) {
                System.out.println("Convertida: " + aux.convertida + ", Resultado: " + aux.resultado);
                aux = aux.proximo;
            }
        }
    }
}
