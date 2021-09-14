public class Bambino {
    private String Nome;
    private String Ruolo;

    public Bambino(String nome,String ruolo){
        this.Nome = nome;
        this.Ruolo = ruolo;
    }


    public String getRuolo() {
        return Ruolo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setRuolo(String ruolo) {
        Ruolo = ruolo;
    }
}
