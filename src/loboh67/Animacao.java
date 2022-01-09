package loboh67;

import java.util.ArrayList;

public class Animacao extends Filme {

    private double avaliacao;

    public Animacao(String titulo, ArrayList<Ator> atores, int anoProd, Realizador realizador, double avaliacao) {
        super(titulo, atores, anoProd, realizador);
        this.avaliacao = avaliacao;
    }

    @Override
    public String tipoFilme() {
        return "Animacao";
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    @Override
    public String toString() {
        return "Animacao{" +
                "avaliacao=" + avaliacao +
                ", titulo='" + titulo + '\'' +
                ", atores=" + atores +
                ", anoProd=" + anoProd +
                ", realizador=" + realizador +
                '}';
    }
}
