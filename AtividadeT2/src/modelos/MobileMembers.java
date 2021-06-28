package AtividadeT2.modelos;

import AtividadeT2.SystemDrive;
import AtividadeT2.enums.Horario;
import AtividadeT2.enums.Membros;

// Contrutor da do cadastro de um "Heavy Lifter". //

public class MobileMembers extends AtividadeT2.modelos.Membro {


    public MobileMembers(String nome, String email) {
        super(nome, email);
        this.categoria = Membros.MOBILEMEMBERS.name();
    }



    public void mostrarResumo() {
        System.out.println(
                "Nome: " + this.nome +
                        ";\tCategoria: " + this.categoria +
                        ";\tEmail: " + this.email +
                        ";\tId: " + this.id
        );
    }



    public void postarMensagem() {
        if (SystemDrive.getHorarioAtual().contentEquals(Horario.REGULAR.name())) {
            System.out.println(this.categoria + " " + this.nome + ": Happy Coding!");
        } else if (SystemDrive.getHorarioAtual().contentEquals(Horario.EXTRA.name())) {
            System.out.println(this.categoria + " " + this.nome + ": MAsK_S0c13ty");
        }
    }


    public String toString() {
        return "MobileMembers{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}