public class Pilha {
    public Celula topo;
    public int tamanho;

    Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean vazia(){
        return this.topo == null;
    }

    public void empilhar(String v){

        Celula c = new Celula(v);

        c.prox = this.topo;
        this.topo = c;
        this.tamanho++;

    }

    public Celula desimpilhar(){

        if(vazia()){
            System.out.println("Pilha vazia");
            return null;
        }else{
            Celula aux = this.topo;
            this.topo = aux.prox;
            aux.prox = null;
            this.tamanho--;

            return aux;
        }
    }

    public void esvaziaPilha(){
        this.topo = null;
        this.tamanho = 0;
    }

    public void imprimi(){
        if(vazia()){
            System.out.println("Pilha vazia");
        } else{
            Celula aux = topo;
            int i = 0;
            while (i < this.tamanho) {
                System.out.println(aux.elemento);
                aux = aux.prox;
                i++;
            }
        }   
    }
}
