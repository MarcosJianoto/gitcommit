import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = 2;
        double[][] vect = new double[n][n];
        double[][] vect2 = new double[n][n];

        System.out.println("fale sua primeira matriz: ");
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect[0].length; j++) {
                vect[i][j] = sc.nextDouble();
            }
        }

        System.out.println("fale sua segunda matriz: ");
        for (int i = 0; i < vect2.length; i++) {
            for (int j = 0; j < vect2[0].length; j++) {
                vect2[i][j] = sc.nextDouble();
            }
        }

        double[][] vectSoma = new double[n][n];

        System.out.println("A soma das matrizes: ");
        for (int i = 0; i < vectSoma.length; i++) {
            for (int j = 0; j < vect[0].length; j++) {
                vectSoma[i][j] = vect[i][j] + vect2[i][j];
            }
        }

        for (int i = 0; i < vectSoma.length; i++) {
            for (int j = 0; j < vect[0].length; j++) {
                System.out.println(vectSoma[i][j]);
            }
        }
        sc.close();
    }
}
