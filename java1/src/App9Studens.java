import java.util.Scanner;

import entities2.Alunos;
import entities2.GerenciadorNota2;

public class App9Studens {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos voce gostaria? ");
        int n = sc.nextInt();

        GerenciadorNota2 gerenciadorDeNota2 = new GerenciadorNota2();

        for (int i = 0; i < n; i++) {
            System.out.println("Qual nome do aluno? ");
            String name = sc.nextLine();

            System.out.println("Qual nota ele tirou?");
            Double nota = sc.nextDouble();

            Alunos alunos = new Alunos(name, nota);
            gerenciadorDeNota2.adicionarNota(alunos);
        }

        gerenciadorDeNota2.exibirNotas();
        double media = gerenciadorDeNota2.calcularMedia();
        System.out.println(media);

        sc.close();
    }
}
