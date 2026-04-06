package it.unicam.universita.mdp2526;

public class Esame {

    private String nome;
    private Valutatore valutatore;

    public Esame(String nome, Valutatore valutatore) {
        setNome(nome);
        setValutatore(valutatore);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome esame non valido");
        }
        this.nome = nome;
    }

    public Valutatore getValutatore() {
        return valutatore;
    }

    public void setValutatore(Valutatore valutatore) {
        if (valutatore == null) {
            throw new IllegalArgumentException("Valutatore non valido");
        }
        this.valutatore = valutatore;
    }

    public void sostieniEsame(Studente studente) {
        if (studente == null) {
            throw new IllegalArgumentException("Studente non valido");
        }

        int voto = valutatore.assegnaVoto(studente);
        String votoString = (voto == 31) ? "30 e lode" : String.valueOf(voto);

        System.out.println("Esame di " + nome);
        System.out.println("Studente: " + studente.getNomeCompleto());
        System.out.println("Voto assegnato: " + votoString);
    }
}