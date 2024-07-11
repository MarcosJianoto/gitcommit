import java.time.LocalDateTime;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Verificação de Número Positivo: Verifique se um número é positivo, negativo
        // ou zero;
        if (n < 0 || n == 0 || n > 0) {
            if (n < 0) {
                System.out.println("menor que 0");
            } else if (n == 0) {
                System.out.println("0");
            } else if (n > 0) {
                System.out.println("mairo que 0");
            }

        }

        sc.close();
    }
}
