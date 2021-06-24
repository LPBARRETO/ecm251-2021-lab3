package barreto.lucas;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Scanner scanner;
    private Conta conta;

    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
        this.conta = new Conta(1236,1000,"Toad")
    }

    public void executar(){
        while(continuarExecucao) {
            exibirMenu();
            int opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch(opcao){
            case 0:
                System.out.println("Obrigado por ter utilizado nosso sistema!");
                this.continuarExecucao = false;
                break;
            case 1:
                System.out.printf("Saldo: R$" + this.conta.getSaldo());
            case 2:
                System.out.println("Informe valor:");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Opeeração realizada com sucesso!");
                break;
            case 3:
                System.out.println("Informe o valor:");
                double valorParaRetirar = scanner.nextDouble();
                if(this.conta.sacar((valorParaRetirar)){
                    System.out.println("Operação realizada com sucesso!");
            } else{
                System.out.println("Operação falhou! Verificar Saldo!");
            }
            default:
                System.out.println("Funcionalidade ainda não implementada");
                break;

        }

    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar Dinheiro");
        System.out.println("3 - Sacar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Título");
        System.out.println("0 - Sair do sistema");

    }
}
