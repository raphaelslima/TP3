import java.util.Scanner;

public class LerEscrever {

    public static String ler(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a notação pós-fixa: ");
        
        return sc.nextLine();
    }

    public static void escrever(String stringFinal){
        System.out.println(stringFinal);

    }
}
