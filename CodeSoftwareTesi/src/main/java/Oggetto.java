public class Oggetto {
    private String descizione;
    private String obiettivo;

    public Oggetto(String descrizione, String obiettivo){
        this.descizione = descrizione;
        this.obiettivo = obiettivo;
    }

    public String getDescizione() {
        return descizione;
    }

    public String getObiettivo() {
        return obiettivo;
    }

    public void setDescizione(String descizione) {
        this.descizione = descizione;
    }

    public void setObiettivo(String obiettivo) {
        this.obiettivo = obiettivo;
    }
}
