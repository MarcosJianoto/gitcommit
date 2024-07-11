import java.time.LocalDateTime;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 numeros: ");
        double[] vect = new double[5];
        int n;
        int soma = 0;

        for (int i = 0; i < vect.length; i++) {
            n = sc.nextInt();
            vect[i] = n;
            soma += vect[i];
        }

        System.out.println(soma);

        sc.close();
    }
}
