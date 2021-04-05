package barreto.lucas;

public class Main {

    public static void main(String[] args) {
        //Criar um objeto do tipo Conta
        Conta c1;
        //Instanciar  um objeto Conta
        c1 = new Conta("Saitama",999.99);
        Conta c2 = new Conta("Goku", "12354678-9");

        c1.depositar(300);
        c1.sacar(250);
        System.out.println("Conta1: " + c1.toString());
        System.out.println("Conta2: " + c2.toString());
    }
}
