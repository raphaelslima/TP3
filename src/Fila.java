public class Fila {
    private int tamanho;
    private Celula frente;
    private Celula tras;

    Fila(){
        this.frente = null;
        this.tras = frente;
        this.tamanho = 0;

    }

    public boolean vazia(){
        return this.frente == null;
    }

    public void enfileirar(String operacao){
        Celula celula = new Celula(operacao);
        if(vazia()){
            frente = celula;  
        } else{
            this.tras.prox = celula;
            }
            this.tras = celula;
            tamanho++;
    }

    public String desenfileirar(){
        if(vazia()){
            System.out.println("Fila vazia.");
            return null;
        } else{
            String operacao = frente.operacao;
            frente = frente.prox;
            if(frente == null){
                tras = null;
            }

            this.tamanho--;
            return operacao;
        }

        
    }

    public void imprimir(){
        if(this.vazia()){
            System.out.println("Fila vazia.");;
        }else{
            Celula aux = frente;
            while (aux != null) {
                System.out.println(aux.operacao+ " ");
                aux = aux.prox;
            }
            System.out.println();
        }
    }
}
