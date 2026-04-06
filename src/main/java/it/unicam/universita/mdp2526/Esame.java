package it.unicam.universita.mdp2526;

public class Esame {

    private String nome;
    private Professore professore;

    public Esame(String nome, Professore professore) {
        setNome(nome);
        setProfessore(professore);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome esame non valido");
        }
        this.nome = nome;
    }

    public Professore getProfessore() {
        return professore;
    }

    public void setProfessore(Professore professore) {
        if (professore == null) {
            throw new IllegalArgumentException("Professore non valido");
        }
        this.professore = professore;
    }

    public void sostieniEsame(Studente studente) {
        if (studente == null) {
            throw new IllegalArgumentException("Studente non valido");
        }

        int voto = professore.assegnaVoto(studente);

        System.out.println("Esame di " + nome);
        System.out.println("Studente: " + studente.getNomeCompleto());
        System.out.println("Professore: " + professore.getNomeCompleto());

        String votoString = (voto == 31) ? "30 e lode" : String.valueOf(voto);

        System.out.println("Voto assegnato: " + votoString);

    }
}