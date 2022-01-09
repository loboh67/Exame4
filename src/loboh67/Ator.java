package loboh67;

public class Ator {

    private String nome;
    private String nacionalidade;
    private String escola;

    public Ator(String nome, String nacionalidade, String escola) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", escola='" + escola + '\'' +
                '}';
    }
}
