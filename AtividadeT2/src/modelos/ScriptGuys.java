package AtividadeT2.modelos;

import AtividadeT2.SystemDrive;
import AtividadeT2.enums.Horario;
import AtividadeT2.enums.Membros;

/// Contrutor da do cadastro de um "Script Guys". //

public class ScriptGuys extends AtividadeT2.modelos.Membro {


    public ScriptGuys(String nome, String email) {
        super(nome, email);
        this.categoria = AtividadeT2.enums.Membros.SCRIPTGUYS.name();
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
            System.out.println(this.categoria + " " + this.nome + ": Prazer em ajudar novos amigos de codigo!");
        } else if (SystemDrive.getHorarioAtual().contentEquals(Horario.EXTRA.name())) {
            System.out.println(this.categoria + " " + this.nome + ": QU3Ro_S3us_r3curs0s.py");
        }
    }


    public String toString() {
        return "ScriptGuys{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}