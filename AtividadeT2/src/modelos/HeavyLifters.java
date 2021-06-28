package AtividadeT2.modelos;

import AtividadeT2.SystemDrive;
import AtividadeT2.enums.Horario;
import AtividadeT2.enums.Membros;

// Contrutor da do cadastro de um "Heavy Lifterr". //
public class HeavyLifters extends AtividadeT2.modelos.Membro {


    public HeavyLifters(String nome, String email) {
        super(nome, email);
        this.categoria = Membros.HEAVYLIFTERS.name();
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
            System.out.println(this.categoria + " " + this.nome + ": Podem contar conosco!");
        } else if (SystemDrive.getHorarioAtual().contentEquals(Horario.EXTRA.name())) {
            System.out.println(this.categoria + " " + this.nome + ": N00b_qu3_n_Se_r3pita.bat");
        }
    }



    public String toString() {
        return "HeavyLifters{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}