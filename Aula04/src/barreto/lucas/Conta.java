package barreto.lucas;

public class Conta {
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }



    //Atributos de classe
    private int numero;
    private double saldo;
    private Cliente cliente;


    //Métodos de classe

    //Construtor da classe
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;
    }

    public Conta(String nomeCliente, String cpf){
        this.cliente = new Cliente(nomeCliente);
    }



    public void visualizarSaldo() {
        System.out.println("Saldo da conta:  R$" + this.saldo);
    }
    public void depositar(double valor) {
//        this.saldo = this.saldo + valor
        this.saldo += valor;
    }
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferirPara(double valor, Conta destino) {
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
