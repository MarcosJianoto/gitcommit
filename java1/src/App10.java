import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String one = "joao";

        String letraRepete = "o";
        int soma = 0;
        for (int i = 0; i < one.length(); i++) {
            if (letraRepete.equals(one.charAt(i))) {
                soma += 1;
            }
        }
        System.out.println("a letra, aparece : " + soma + " vezes");

        sc.close();
    }
}
