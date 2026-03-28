package it.unicam.universita.mdp2526;

public class Professore {

    private String nome;
    private String cognome;
    private String settore;

    public Professore(String nome, String cognome, String settore) {
        this.nome = nome;
        this.cognome = cognome;
        this.settore = settore;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSettore() {
        return settore;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    public void presenta() {
        System.out.println("Sono il professore " + getNomeCompleto()
                + ", settore " + settore);
    }
}