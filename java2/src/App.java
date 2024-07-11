import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        soma();
        divisao();
        multiplicacao();
        subtracao();

    }

    public static void soma() {

        int x, y;
        int soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.println("Digite o valor de y: ");
        y = sc.nextInt();

        soma = x + y;
        System.out.println("Soma dos numeros = " + soma);
    }

    public static void subtracao() {
        int x, y;
        int subtracao;
        x = 5;
        y = 10;
        subtracao = x - y;
        System.out.println("subtracao " + subtracao);

    }

    public static void divisao() {
        int x, y;
        int divisao;
        x = 5;
        y = 10;
        divisao = x / y;
        System.out.println("divisao = " + divisao);
    }

    public static void multiplicacao() {
        int x, y;
        int multiplicacao;
        x = 5;
        y = 10;
        multiplicacao = x * y;
        System.out.println("multiplicacao = " + multiplicacao);
    }
}
