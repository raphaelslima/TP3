public class Pilha {
    public Celula topo;
    public int tamanho;
    private int resultado;

    Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean vazia() {
        return this.topo == null;
    }

    public void empilhar(String convertida, int resultado) {
        Celula c = new Celula(convertida, resultado);

        c.proximo = this.topo;
        this.topo = c;
        this.tamanho++;
    }

    public Celula desimpilhar() {
        if (vazia()) {
            System.out.println("Pilha vazia");
            return null;
        } else {
            Celula aux = this.topo;
            this.topo = aux.proximo;
            aux.proximo = null;
            this.tamanho--;

            return aux;
        }
    }

    public void esvaziaPilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void percorrerPilha() {
        String expressao = LerEscrever.ler();
        String[] tokens = expressao.split("\\s+");

        for (String token : tokens) {
            try {
                int valor = Integer.parseInt(token);
                empilhar(token, valor);
            } catch (Exception e) {
                Celula aux = desimpilhar();
                int b = aux.resultado;
                aux = desimpilhar();
                int a = aux.resultado;

                int operacao = 0;
                switch (token) {
                    case "+":
                        operacao = a + b;
                        break;
                    case "-":
                        operacao = a - b;
                        break;
                    case "*":
                        operacao = a * b;
                        break;
                    case "/":
                        if (b != 0) {
                            operacao = a / b;
                        }
                        break;
                    default:
                        break;
                }
                empilhar(String.valueOf(operacao), operacao);
            }
        }
        imprimi();
    }

    public void imprimi() {
        if (vazia()) {
            System.out.println("Pilha vazia");
        } else {
            Celula aux = topo;
            while (aux != null) {
                System.out.println("Convertida: " + aux.convertida + ", Resultado: " + aux.resultado);
                aux = aux.proximo;
            }
        }
    }
}
