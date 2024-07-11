import java.time.LocalDateTime;
import java.util.Scanner;

import entities.GerenciadorDeNota;
import entities.Students;

public class App8Students {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        GerenciadorDeNota gerenciadorDeNota = new GerenciadorDeNota();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno" + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Digite a nota do aluno: " + name + ": ");
            Double note = sc.nextDouble();
            sc.nextLine();

            Students studens = new Students(name, note);
            gerenciadorDeNota.adicionarNota(studens);
        }

        System.out.println("\nNotas dos Alunos: ");
        gerenciadorDeNota.exibirNotas();

        double media = gerenciadorDeNota.calcularMedia();
        System.out.println("\nA média das notas é: " + media);

        sc.close();
    }
}
