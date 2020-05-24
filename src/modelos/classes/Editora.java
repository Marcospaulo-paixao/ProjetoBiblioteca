package modelos.classes;

public class Editora {

    private int id;
    private String nome;
    private String descricao;

    public Editora(Editora obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }

    public Editora(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + descricao;
    }

}
