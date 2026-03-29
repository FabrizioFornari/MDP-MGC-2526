package it.unicam.universita.mdp2526;

public class Studente extends Persona {

    private final int matricola;

    public Studente(String nome, String cognome, int matricola) {
        super(nome, cognome);

        if (matricola <= 0) {
            throw new IllegalArgumentException("Matricola non valida");
        }

        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void saluta() {
        System.out.println("Ciao, sono lo studente " + getNomeCompleto());
    }
}