package barreto.lucas;

public class Cliente {
    private String titular;
    private String cpf;

    public Cliente(String titular){
        this.titular = titular;
    }
    
    System.out.println("Hello World!")

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
