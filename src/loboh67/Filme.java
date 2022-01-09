package loboh67;

import java.util.ArrayList;

public abstract class Filme {

    protected String titulo;
    protected ArrayList<Ator> atores;
    protected int anoProd;
    protected Realizador realizador;

    public Filme(String titulo, ArrayList<Ator> atores, int anoProd, Realizador realizador) {
        this.titulo = titulo;
        this.atores = atores;
        this.anoProd = anoProd;
        this.realizador = realizador;
    }

    public abstract String tipoFilme();

    public String getTitulo() {
        return titulo;
    }

    public int getAnoProd() {
        return anoProd;
    }

    public Realizador getRealizador() {
        return realizador;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", atores=" + atores +
                ", anoProd=" + anoProd +
                ", realizador=" + realizador +
                '}';
    }
}
