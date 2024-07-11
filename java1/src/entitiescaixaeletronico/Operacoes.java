package entitiescaixaeletronico;

public class Operacoes extends Caixa {

    public Operacoes(String name, double saldo) {
        super(name, saldo);
    }

    public void consultaSaldo() {
        System.out.println(saldo);
    }

    public double saqueDinheiro(double quantia) {
        return saldo -= quantia;
    }

    public double depositDinheiro(double quantia) {
        return saldo += quantia;
    }

}
