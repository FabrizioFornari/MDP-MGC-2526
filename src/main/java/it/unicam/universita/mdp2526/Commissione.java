package it.unicam.universita.mdp2526;

import java.util.ArrayList;
import java.util.List;

public class Commissione implements Valutatore {

    private List<Professore> membri;

    public Commissione() {
        this.membri = new ArrayList<>();
    }

    public void aggiungiMembro(Professore professore) {
        if (professore == null) {
            throw new IllegalArgumentException("Professore non valido");
        }
        membri.add(professore);
    }

    public List<Professore> getMembri() {
        return membri;
    }

    @Override
    public int assegnaVoto(Studente studente) {
        if (studente == null) {
            throw new IllegalArgumentException("Studente non valido");
        }

        if (membri.isEmpty()) {
            throw new IllegalStateException("La commissione non ha membri");
        }

        int somma = 0;

        for (Professore professore : membri) {
            int voto = professore.assegnaVoto(studente);
            System.out.println(professore.getNomeCompleto() + " propone: " + voto);
            somma += voto;
        }

        int media = somma / membri.size();

        return media;
    }
}