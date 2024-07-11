import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String digit = sc.nextLine();

        System.out.println(digit.length());

        sc.close();
    }
}
