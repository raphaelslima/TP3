public class App {
    public static void main(String[] args) throws Exception {
        // ------------------------------------------
        // String expressao = LerEscrever.ler(); // Lê uma linha no terminal
        // chamar um método da classe Calcular que retorna a expressão connvertida e o
        // resultado, passando "expressao" por parâmtro.
        // LerEscrever.escrever(expressao); // imprime a string resultado
        Pilha pilha = new Pilha();
        //Nathan e Pedro: método percorrePilha retorna a expressão convertida e o resultado final como String
        String resultado = pilha.percorrerPilha();
        System.out.println("Expressão convertida: " + resultado);

    }
}
