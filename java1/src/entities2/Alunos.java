package entities2;

public class Alunos {

    private String aluno;
    private double nota;

    public Alunos(String aluno, double nota) {
        this.aluno = aluno;
        this.nota = nota;
    }

    public String getAluno() {
        return this.aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
