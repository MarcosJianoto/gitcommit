package entities;

public class Students {

    private String student;
    private double nota;

    public Students() {
    }

    public Students(String student, double nota) {
        this.student = student;
        this.nota = nota;
    }

    public String getStudent() {
        return this.student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
