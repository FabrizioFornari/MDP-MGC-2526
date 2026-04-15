package it.unicam.universita.mdp2526;

public class Studente extends Persona {

    private final int matricola;
    private final Libretto libretto;

    public Studente(String nome, String cognome, int matricola, Libretto libretto) {
        super(nome, cognome);

        if (matricola <= 0) {
            throw new IllegalArgumentException("Matricola non valida");
        }

        this.matricola = matricola;
        this.libretto = libretto;
    }

    public int getMatricola() {
        return matricola;
    }

    public Libretto getLibretto() {
        return libretto;
    }

    public void saluta() {
        System.out.println("Ciao, sono lo studente " + getNomeCompleto());
    }
}