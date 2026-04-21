package it.unicam.universita.mdp2526;

public class Main {

    public static void main(String[] args) {

        Studente studente = new Studente("Anna", "Rossi", 1001);

        Professore professore = new Professore("Luca", "Bianchi", "Programmazione");

        Esame esame = new Esame("Metodologie di Programmazione", professore);

        studente.presentati();

        esame.sostieniEsame(studente);

        studente.getLibretto().stampaEsamiSuperati();
        System.out.println("Media: " + studente.getLibretto().calcolaMedia());

        Persona p1 = new Studente("Anna", "Rossi", 1001);
        Persona p2 = new Professore("Luca", "Bianchi", "Informatica");

        p1.presentati();
        p2.presentati();

    }
}