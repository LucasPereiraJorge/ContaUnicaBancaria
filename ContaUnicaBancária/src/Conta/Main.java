package Conta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;

        System.out.println("Por favor insira o titular da conta: ");
        aux = scanner.nextLine();

        Conta C1 = new Conta(aux);

        do {
            System.out.println(" MENU ");
            System.out.println("(1) Dados Bancários");
            System.out.println("(2) Depósito");
            System.out.println("(3) Saque");
            System.out.println("(4) Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                C1.DadosBancários();
            }else if (opcao == 2){
                System.out.println("Informe o valor do depósito");
                valor = scanner.nextDouble();

                C1.Depositar(valor);
            }else if (opcao == 3){
                System.out.println("Informe o valor do saque");
                valor = scanner.nextDouble();

                C1.Sacar(valor);
            }

        }while (opcao != 4);

    }
}