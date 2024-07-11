import java.util.Random;
import java.util.Scanner;

import entitiescaixaeletronico.Caixa;
import entitiescaixaeletronico.Operacoes;

public class App13_caixaEletronico {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        /*
         * 10. Simulador de Caixa Eletrônico:
         * 
         * Desenvolva um simulador simples de caixa eletrônico. O programa deve permitir
         * que o usuário realize as seguintes operações:
         * 
         * Consulta de saldo
         * Saque de dinheiro
         * Depósito de dinheiro
         * Transferência bancária
         */

        Operacoes operacoes = new Operacoes("Maria", 500.00);
        operacoes.consultaSaldo();
        operacoes.depositDinheiro(300);
        operacoes.consultaSaldo();

        sc.close();
    }
}
