public class Pilha {
    private Celula topo;
    private int tamanho;

    Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean vazia(){
        return this.topo == null;
    }

    public void empilhar(String operacao, int resultado){
        Celula celula = new Celula(operacao, resultado);
        celula.prox = topo;
        topo = celula;
        tamanho++;
    
        }
    

    public Celula desimpilhar(){

        if(vazia()){
            System.out.println("Pilha vazia");
            return null;
        }else{
            Celula aux = topo;
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
            while (aux != null) {
                System.out.println(aux.operacao +" = " + aux.resultado);
                aux = aux.prox;
                
            }
        }   
    }
  public void processar(String operador){
    if (vazia() || topo.prox == null) {
        System.out.println("Pilha não tem elementos suficientes para a operação.");
        return;
    }

    Celula a = desimpilhar();
    Celula b = desimpilhar();
    int resultado = 0;
    String operacao = "";

    switch (operador) {
        case "+":
            resultado = b.resultado + a.resultado;
            operacao = "(" + b.operacao + " + " + a.operacao + ")";
            break;
        case "-":
            resultado = b.resultado - a.resultado;
            operacao = "(" + b.operacao + " - " + a.operacao + ")";
            break;
        case "*":
            resultado = b.resultado * a.resultado;
            operacao = "(" + b.operacao + " * " + a.operacao + ")";
            break;
        case "/":
            if (a.resultado != 0) {
                resultado = b.resultado / a.resultado;
                operacao = "(" + b.operacao + " / " + a.operacao + ")";
            } else {
                System.out.println("Divisão por zero.");
                return;
            }
            break;
        default:
            System.out.println("Operador desconhecido.");
            return;
    }

    empilhar(operacao, resultado);
  }
}