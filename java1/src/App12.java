import java.util.Scanner;

public class App12 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String frase = "Marcos Pedro Leticia Juliano";

        String[] fraseContagem = frase.split(" ");
        System.out.println(fraseContagem);

        int soma = 0;
        for (int i = 0; i < fraseContagem.length; i++) {
            System.out.println(fraseContagem[i]);
            soma += 1;
        }
        System.out.println(soma);

        sc.close();
    }
}
