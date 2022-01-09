package loboh67;

import java.util.ArrayList;

public class CicloCinema {

    public static void main(String[] args) {
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        String dataInicio = "08/01/2022";
        String dataFim = "14/01/2022";

        Ator ator1 = new Ator("Henrique Lobo", "Portuguesa", "IBM");
        Ator ator2 = new Ator("Mia Khalifa", "Libanesa", "Putaria do Convento");
        Ator ator3 = new Ator("Lana Rhoades", "Norte Americana", "Pornhub School");

        Realizador realizador1 = new Realizador("Henrique Lobo", "Portuguesa", 12);
        Realizador realizador2 = new Realizador("Johny Sins", "Norte Americana", 69);

        ArrayList<Ator> atores1 = new ArrayList<>();
        atores1.add(ator1);
        atores1.add(ator3);

        ArrayList<Ator> atores2 = new ArrayList<>();
        atores2.add(ator1);
        atores2.add(ator2);
        atores2.add(ator3);

        ArrayList<Ator> atores3 = new ArrayList<>();
        atores3.add(ator1);
        atores3.add(ator2);

        Dramatico d1 = new Dramatico("Presa na máquina de lavar a roupa", atores1, 2019, realizador1, 18);
        Animacao a1 = new Animacao("A 3 é melhor", atores2, 2020, realizador2, 4.6);
        Animacao a2 = new Animacao("Fantasia das Arábias", atores3, 2021, realizador1, 4.9);

        listaFilmes.add(d1);
        listaFilmes.add(a1);
        listaFilmes.add(a2);

        listaFilmes(listaFilmes);
        maiorAvaliacao(listaFilmes);
    }

    private static void listaFilmes(ArrayList<Filme> listaFilme) {
        for (Filme f : listaFilme) {
            System.out.println(f.getTitulo() + ", " + f.getAnoProd() + ", " + f.getRealizador().getNome());
        }
    }

    private static void maiorAvaliacao(ArrayList<Filme> listaFilme) {
        double maiorAvaliacao = 0;
        Animacao melhorAvaliada = null;
        for (Filme f : listaFilme) {
            if (f.tipoFilme().equals("Animacao")) {
                Animacao a = (Animacao) f;
                if (a.getAvaliacao() > maiorAvaliacao) {
                    maiorAvaliacao = a.getAvaliacao();
                    melhorAvaliada = a;
                }
            }
        }
        if (melhorAvaliada != null) {
            System.out.println(melhorAvaliada.getTitulo());
        } else {
            System.out.println("Não existe nenhum filme de Animação no Ciclo de Cinema");
        }
    }
}
