package AtividadeT2.modelos;

import AtividadeT2.interfaces.Apresentacao;
import AtividadeT2.interfaces.Mensagem;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

// Classe abstrta pai de todos os tipos de membro. //
public abstract class Membro implements Apresentacao, Mensagem {


    private static Set<String> idLinkedHashSet = new LinkedHashSet<>();

    protected String categoria;

    protected String nome;

    protected String id;

    protected String email;

    private Random randomizer = new Random();


    public Membro (String nome, String email) {
        this.nome = nome;
        this.email = email;
        String idTemp;

        do {
            idTemp = "";
            for (int i = 0; i < 10; i++) {
                int idInteger = randomizer.nextInt(10);
                idTemp += idInteger;
            }
        } while (idLinkedHashSet.contains(idTemp));

        idLinkedHashSet.add(idTemp);
        this.id = idTemp;
    }


    public static void removeIdSet(String idRemove) {
        try {
            idLinkedHashSet.remove(idRemove);
        } catch (Exception exception) {
            System.out.println("Falha ao remover id. Numero nao encontrado");
            exception.printStackTrace();
        }
    }


    public String getId() {

        return id;
    }


    public String getCategoria() {
        return categoria;
    }


    public String getNome() {
        return nome;
    }
}
