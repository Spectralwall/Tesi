public class ParteRiflessiva extends Phase{
    private Phase nextPhase;

    public ParteRiflessiva(String nome, String descrizione, String descrizioneTask) {
        super(nome, descrizione, descrizioneTask);
    }

     public void setNextPhase(Phase nextPhase) {
        this.nextPhase = nextPhase;
    }

    @Override
    Phase nextPhase() {
        return getNextPhase();
    }

    public Phase getNextPhase() {
        return nextPhase;
    }
}
