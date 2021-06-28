package AtividadeT2;

import AtividadeT2.enums.Horario;
import AtividadeT2.modelos.BigBrothers;
import AtividadeT2.modelos.HeavyLifters;
import AtividadeT2.modelos.MobileMembers;
import AtividadeT2.modelos.ScriptGuys;
import AtividadeT2.modelos.Membro;


import java.util.HashMap;
import java.util.Scanner;


public abstract class SystemDrive {

    /**Scanner para ler input do usuario .*/
    private static final Scanner scanner = new Scanner(System.in);
    /**Variavel "hashmap" que salva a referencia para objetos.*/
    private static final HashMap<String, BigBrothers> membro = new HashMap<String, BigBrothers>();
    /**Variavel que guarda informacao do horario atual de trabalho*/
    private static String horarioAtual = Horario.REGULAR.name();

    /**Looping do sistema*/
    public static void runCode (boolean runState) {
        System.out.println("\n Bem vindo ao MAsK_S0c13ty, hacker!-\n");
        while (runState) {
            runState = menuPrograma();
        }
    }

    /**Menu*/
    private static boolean menuPrograma() {

        int caseVar = -1;

        System.out.println("\nHorario de trabalho atual: " + horarioAtual);
        System.out.println(  "Opcoes:\n1 - Para postar mensagem;" +
                                    "\n2 - Para cadastrar membros;" +
                                    "\n3 - Para remover membros;" +
                                    "\n4 - Para exibir resumo de todos os usuarios;" +
                                    "\n5 - Para trocar o horario de trabalho(REGULAR ou EXTRA);" +
                                    "\n0 - Para Sair." +
                                    "\n \n Escolha uma opcao:");

        boolean loopParseError = true;
        while (loopParseError) {
            try {
                caseVar = Integer.parseInt(scanner.nextLine());
                loopParseError = false;
            } catch (Exception exception) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
            }
        }

        switch (caseVar) {
            case 1:
                System.out.println("Digite sua mensagem: ");
                scanner.nextLine();
                membro.forEach((k, v) -> v.postarMensagem());
                break;

            case 2:
                cadastrarUsuarios();
                break;

            case 3:
                removerUsuarios();
                break;

            case 4:
                if (!membro.isEmpty()) {
                    membro.forEach((k, v) -> v.mostrarResumo());
                } else {
                    System.out.println("Nenhum membro cadastrado.");
                }
                break;

            case 5:
                if (horarioAtual.contentEquals(Horario.REGULAR.name())) {
                    horarioAtual = "EXTRA";
                } else if (horarioAtual.contentEquals(Horario.EXTRA.name())) {
                    horarioAtual = "REGULAR";
                }
                System.out.println("Novo horario de trabalho definido. Horario atual de trabalho: " + horarioAtual);
                break;

            case 0:
                System.out.println("Encerrando o Programa.");
                return false;

            default:
                System.out.println("Entrada invalida! Tente novamente.");
                break;
        }
        return true;
    }

    /**Cadastro de novos usários*/
    private static void cadastrarUsuarios() {

        boolean loopSwitch = true;
        String nome, email;


        System.out.println("Insira o nome do Usuario:");
        nome = scanner.nextLine().trim();
        while (membro.containsKey(nome)) {
            System.out.println("Nome ja cadastrado. Escolha outro nome.");
            nome = scanner.nextLine().trim();
        }

        System.out.println("Insira o email do Usuario:");
        email = scanner.nextLine().trim();

        while (loopSwitch) {

            int switchCase = -1;

            boolean loopParseError = true;
            while (loopParseError) {
                System.out.println("  Categorias:\n1 - Big Brothers;" +
                                                "\n2 - Heavy Lifters;" +
                                                "\n3 - Mobile Members;" +
                                                "\n4 - Script Guys." +
                                                "\nEscolha uma categoria:");
                try {
                    switchCase = Integer.parseInt(scanner.nextLine());
                    loopParseError = false;
                } catch (Exception exception) {
                    System.out.println("Entrada invalida! Digite um numero inteiro.\n");
                }
            }

            switch (switchCase) {

                case 1:
                    membro.putIfAbsent(nome, new BigBrothers(nome, email));
                    loopSwitch = false;
                    break;

                case 2:
                    membro.putIfAbsent(nome, new HeavyLifters(nome, email));
                    loopSwitch = false;
                    break;

                case 3:
                    membro.putIfAbsent(nome, new MobileMembers(nome, email));
                    loopSwitch = false;
                    break;

                case 4:
                    membro.putIfAbsent(nome, new ScriptGuys(nome, email));
                    loopSwitch = false;
                    break;

                default:
                    System.out.println("Opcao invalida! Digite novamente.");
                    break;
            }

        }
    }

    /**Metodo que remove os usuários.*/
    public static void removerUsuarios() {
        String nome;
        System.out.println("Insira o nome do Usuario:");
        nome = scanner.nextLine().trim();
        if (membro.containsKey(nome)) {
            Membro.removeIdSet(membro.get(nome).getId());
            membro.remove(nome);
            System.out.println("Usuario " + nome + " removido.");
        } else {
            System.out.println("Usuario " + nome + " nao encontrado no banco de dados.");
        }
    }
    /** metodo que mostra o horario atual*/
    public static String getHorarioAtual() {

        return horarioAtual;
    }
}
