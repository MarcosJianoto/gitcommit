import java.util.Scanner;

public class App2 {

    // Variáveis de classe.
    static int x, y;
    static int soma;
    static int subtracao;

    public static void main(String[] args) throws Exception {
        x = 5;
        y = 10;
        soma();
        subtracao();

    }

    public static void soma() {
        soma = x + y;
        System.out.println("Soma = " + soma);
    }

    public static void subtracao() {
        subtracao = x - y;
        System.out.println("subtracao: " + subtracao);
    }
}
