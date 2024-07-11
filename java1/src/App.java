import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        System.out.println("Role os dados: ");

        int dado1 = random.nextInt(6 + 1);
        int dado2 = random.nextInt(6 + 1);

        int[] vect = new int[1000000];

        int result;
        int soma2 = 0, soma3 = 0, soma4 = 0, soma5 = 0, soma6 = 0, soma7 = 0, soma8 = 0, soma9 = 0, soma10 = 0,
                soma11 = 0, soma12 = 0;
        for (int i = 0; i < vect.length; i++) {
            vect[i] = dado1 + dado2;
            if (vect[i] == 2) {
                soma2 += 1;
            } else if (vect[i] == 3) {
                soma3 += 1;
            } else if (vect[i] == 4) {
                soma4 += 1;
            } else if (vect[i] == 5) {
                soma5 += 1;
            } else if (vect[i] == 6) {
                soma6 += 1;
            } else if (vect[i] == 7) {
                soma7 += 1;
            } else if (vect[i] == 8) {
                soma8 += 1;
            } else if (vect[i] == 9) {
                soma9 += 1;
            } else if (vect[i] == 10) {
                soma10 += 1;
            } else if (vect[i] == 11) {
                soma11 += 1;
            } else if (vect[i] == 12) {
                soma12 += 1;
            }

            dado1 = random.nextInt(7);
            dado2 = random.nextInt(7);
        }

        System.out.println("Resultados dos dados: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("resultado da rolagem de dados %d = " + vect[i] + " %n", i + 1);
        }

        System.out.println("Quantidade de vezes que os numeros aparecem: ");
        System.out.println(soma2);
        System.out.println(soma3);
        System.out.println(soma4);
        System.out.println(soma5);
        System.out.println(soma6);
        System.out.println(soma7);
        System.out.println(soma8);
        System.out.println(soma9);
        System.out.println(soma10);
        System.out.println(soma11);
        System.out.println(soma12);

    }
}
