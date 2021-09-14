public class Lezione {
    private Phase phase;
    private Oggetto object;
    private String nomeLezione;

    public Lezione(String nome,String descrizioneOggetto, String obiettivoOggetto){
        this.nomeLezione = nome;
        this.object = new Oggetto(descrizioneOggetto,obiettivoOggetto);
        phase = null;
    }


    public void nextPhase(){
        setPhase(phase.nextPhase());
    }

    public Oggetto getObject() {
        return object;
    }

    public Phase getPhase() {
        return phase;
    }

    public void setObject(Oggetto object) {
        this.object = object;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    @Override
    public String toString() {
        return "Lezione{" +
                "phase=" + phase +
                ", object=" + object +
                ", nomeLezione='" + nomeLezione + '\'' +
                '}';
    }
}
