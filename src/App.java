public class App {
    public static void main(String[] args) throws Exception {

        //------------------------------------------
        String expressao = LerEscrever.ler(); //Lê uma linha no terminal

        
        
        LerEscrever.escrever(expressao); //imprime a string resultado
        //------------------------------------------
        
        System.out.println("---------Teste Pilha------------");
        System.out.println("---------Teste Empilha------------");
        Pilha pilhaDeDados = new Pilha();
        pilhaDeDados.empilhar("1");
        pilhaDeDados.empilhar("+");
        pilhaDeDados.empilhar("3");
        System.out.println("---------Teste Imprimi------------");
        pilhaDeDados.imprimi();
        System.out.println("---------Teste Desempilha------------");
        System.out.println(pilhaDeDados.desimpilhar().elemento);
        System.out.println("---------Teste Imprime depois de Desempilhar------------");
        pilhaDeDados.imprimi();
        pilhaDeDados.esvaziaPilha();
        System.out.println("---------Teste Imprime depois de Esvaziar------------");
        pilhaDeDados.imprimi();

        System.out.println("---------Teste Fila------------");
        System.out.println("---------Teste Enfileirar------------");
        Fila filaDedados = new Fila();
        filaDedados.enfileirar("1");
        filaDedados.enfileirar("+");
        filaDedados.enfileirar("2");
        filaDedados.imprimir();
        System.out.println("---------Teste Desimfileirar------------");
        System.out.println(filaDedados.desenfileirar().elemento);
        System.out.println("---------Teste Imprime depois de Desimfileiras------------");
        filaDedados.imprimir();
    }
}