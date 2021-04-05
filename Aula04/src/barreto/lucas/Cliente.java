package barreto.lucas;

public class Cliente {
    public Cliente(String nome){
        this.titular = nome ;
    }

    public String titular;
    public String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
