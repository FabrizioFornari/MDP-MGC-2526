package it.unicam.universita.mdp2526;

public class Main {

    public static void main(String[] args) {
        Studente s1 = new Studente("Anna", "Rossi", 1001);
        Studente s2 = new Studente("Marco", "Verdi", 1002);

        Professore p1 = new Professore("Luca", "Bianchi", "Programmazione");

        Corso corso = new Corso("Metodologie di Programmazione", p1);

        s1.saluta();
        p1.presenta();

        corso.iscriviStudente(s1);
        corso.iscriviStudente(s2);

        corso.stampaIscritti();
    }
}