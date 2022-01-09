package loboh67;

public class Realizador {

    private String nome;
    private String nacionalidade;
    private int nFilmes;

    public Realizador(String nome, String nacionalidade, int nFilmes) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.nFilmes = nFilmes;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Realizador{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", nFilmes=" + nFilmes +
                '}';
    }
}
