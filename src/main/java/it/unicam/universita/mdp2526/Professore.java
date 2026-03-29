package it.unicam.universita.mdp2526;

public class Professore extends Persona {

    private String settore;

    public Professore(String nome, String cognome, String settore) {
        super(nome, cognome);
        setSettore(settore);
    }

    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        if (settore == null || settore.isBlank()) {
            throw new IllegalArgumentException("Settore non valido");
        }
        this.settore = settore;
    }

    public void presenta() {
        System.out.println("Sono il professore " + getNomeCompleto() +
                " del settore " + settore);
    }
}