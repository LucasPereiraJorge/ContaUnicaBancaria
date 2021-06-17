package Conta;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;
    static int quantidadeDeContas = 0;

    public Conta(String pTitular){
        titular = pTitular;
        quantidadeDeContas++;
        numeroConta = quantidadeDeContas;
        saldo = 0;
    }

    public void DadosBancários(){
        System.out.println("");
        System.out.println("-- Dados Bancários --");
        System.out.println("Número: " + numeroConta);
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Esses são seus dados bancários");
        System.out.println("");
    }

    public void Depositar(double pValor){
        System.out.println("");
        System.out.println("Realizando o seu depósito");
        System.out.println("O valor do seu saldo antes da realização do depósito era: " + saldo);

        this.saldo += pValor;

        System.out.println("O valor do seu saldo após a realização do depósito é igual a: " + saldo);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("");
    }

    public void Sacar(double pValor){
        System.out.println("");
        System.out.println("Realizando o seu saque");
        System.out.println("O valor do seu saldo antes da realização do saque era: " + saldo);

        if (pValor <= saldo) { //Caso eu tenha saldo
            saldo -= pValor;
            System.out.println("O valor do seu saldo após a realização do saque é igual a: ");
        } else { // Caso o saldo seja insuficiente
            System.out.println("Saldo insuficiente para realizar o saque");
        }
        System.out.println("Saque realizado com sucesso!");
        System.out.println("");
    }
}