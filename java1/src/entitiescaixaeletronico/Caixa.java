package entitiescaixaeletronico;

public class Caixa {

    private String name;
    protected double saldo;

    public Caixa(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
