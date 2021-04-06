package barreto.lucas;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Scanner scanner;

    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
    }

    public void executar(){
        while(continuarExecucao) {
            exibirMenu();
            int opcao = scanner.nextInt();
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
