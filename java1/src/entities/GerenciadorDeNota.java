package entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeNota {

    List<Students> students = new ArrayList<>();

    public void adicionarNota(Students studens) {
        students.add(studens);
    }

    public double calcularMedia() {
        double soma = 0;
        for (Students students : students) {
            soma += students.getNota();
        }
        return soma / students.size();
    }

    public void exibirNotas() {
        for (Students students : students) {
            System.out.printf("Nome: " + students.getStudent() + "%n, Nota: " + students.getNota());
        }
    }

}
