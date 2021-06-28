package AtividadeT2.modelos;

import AtividadeT2.SystemDrive;
import AtividadeT2.enums.Horario;
import AtividadeT2.enums.Membros;

//Contrutor da do cadastro de um "Big Brother". //

public class BigBrothers extends AtividadeT2.modelos.Membro {

    public BigBrothers(String nome, String email) {
        super(nome, email);
        this.categoria = Membros.BIGBROTHERS.name();
    }


    @Override
    public void mostrarResumo() {
        System.out.println(
                "Nome: " + this.nome +
                        ";\tCategoria: " + this.categoria +
                        ";\tEmail: " + this.email +
                        ";\tId: " + this.id
        );
    }

    @Override
    public void postarMensagem() {
        if (SystemDrive.getHorarioAtual().contentEquals(Horario.REGULAR.name())) {
            System.out.println(this.categoria + " " + this.nome + ": Sempre ajudando as pessoas membros ou não S2!");
        } else if (SystemDrive.getHorarioAtual().contentEquals(Horario.EXTRA.name())) {
            System.out.println(this.categoria + " " + this.nome + ": ...");
        }
    }


    @Override
    public String toString() {
        return "BigBrothers{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }