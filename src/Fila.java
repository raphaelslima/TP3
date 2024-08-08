public class Fila {
    public int tamanho;
    public Celula frente;
    public Celula tras;

    Fila(){
        this.frente = new Celula("-1");
        this.tras = frente;
    }

    public boolean vazia(){
        return this.frente == this.tras;
    }

    public void enfileirar(String c){
        Celula celula = new Celula(c);
        if(this.frente == this.tras){
            this.frente.prox = celula;
            this.tras = celula;
        } else{
            this.tras.prox = celula;
            this.tras = celula;
        }
        
        this.tamanho++;
    }

    public Celula desenfileirar(){
        if(this.vazia()){
            System.out.println("Fila vazia.");
            return null;
        } else{
            Celula aux = this.frente.prox;
            this.frente.prox = aux.prox;
            aux.prox = null;
            if(aux == this.tras){
                this.tras = this.frente;
            }

            this.tamanho--;

            return aux;
        }

        
    }

    public void imprimir(){
        if(this.vazia()){
            System.out.println("Fila vazia.");;
        }else{
            Celula aux = this.frente.prox;
            while (aux != null) {
                System.out.println(aux.elemento);
                aux = aux.prox;
            }
        }
    }
}
