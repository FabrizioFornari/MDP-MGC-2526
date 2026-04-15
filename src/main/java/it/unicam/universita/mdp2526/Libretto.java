package it.unicam.universita.mdp2526;

public class Libretto {

    private final Studente studente;
    private int crediti;
    private double media;

    public Libretto(Studente studente) {
        this.studente = studente;
    }

    public void registraVoto(int voto, int cfu) {
        System.out.println("Registrazione voto per " + studente.getNomeCompleto());

        crediti += cfu;
        media = ((media * (crediti - cfu)) + (voto * cfu)) / crediti;
    }

    public boolean puoLaurearsi() {
        return crediti >= 180 && media >= 18;
    }

    public void stampaSituazione() {
        System.out.println("Studente: " + studente.getNomeCompleto());
        System.out.println("Crediti: " + crediti);
        System.out.println("Media: " + media);
    }
}