public class Professore {
    private String Nome;
    private String Cognome;
    private String Ruolo;

    public Professore(String nome,String cognome,String ruolo){
        this.Nome = nome;
        this.Cognome = cognome;
        this.Ruolo = ruolo;
    }

    public String getRuolo() {
        return Ruolo;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getNome() {
        return Nome;
    }

    public void setRuolo(String ruolo) {
        Ruolo = ruolo;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
