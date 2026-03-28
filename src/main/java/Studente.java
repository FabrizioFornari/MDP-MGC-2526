public class Studente {

    private String nome;
    private String cognome;
    private int matricola;

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    public void saluta() {
        System.out.println("Ciao, sono lo studente " + getNomeCompleto());
    }
}