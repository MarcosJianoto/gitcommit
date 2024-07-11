package entities2;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNota2 {

    List<Alunos> alunos = new ArrayList<>();

    public void adicionarNota(Alunos aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        double soma = 0;
        for (Alunos aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.size();
    }

    public void exibirNotas() {
        for (Alunos aluno : alunos) {
            System.out.println(aluno.getAluno() + " tirou nota: " + aluno.getNota());
        }
    }

}
