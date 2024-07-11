import java.util.Random;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de Area de Circulo: ");

        double PI = 3.1415;
        double raio = 5;
        double area = PI * Math.pow(raio, 2);
        System.out.println(area);

        sc.close();
    }
}
