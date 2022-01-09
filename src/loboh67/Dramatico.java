package loboh67;

import java.util.ArrayList;

public class Dramatico extends Filme {

    private int idadeMin;

    public Dramatico(String titulo, ArrayList<Ator> atores, int anoProd, Realizador realizador, int idadeMin) {
        super(titulo, atores, anoProd, realizador);
        this.idadeMin = idadeMin;
    }

    @Override
    public String tipoFilme() {
        return "Dramatico";
    }

    @Override
    public String toString() {
        return "Dramatico{" +
                "idadeMin=" + idadeMin +
                ", titulo='" + titulo + '\'' +
                ", atores=" + atores +
                ", anoProd=" + anoProd +
                ", realizador=" + realizador +
                '}';
    }
}
