package it.unicam.universita.mdp2526;

public class Main {

    public static void main(String[] args) {

        Studente s1 = new Studente("Anna", "Rossi", 1001);
        Professore p1 = new Professore("Luca", "Bianchi", "Informatica");
        s1.presentati();
        p1.presentati();

    }
}