public class ParteRiflessiva extends Phase{
    private Phase nextPhase;

    public ParteRiflessiva(String descrizione, String descrizioneTask,Phase next) {
        super(descrizione, descrizioneTask);
        this.nextPhase = next;
    }

    @Override
    Phase nextPhase() {
        return getNextPhase();
    }

    public Phase getNextPhase() {
        return nextPhase;
    }
}
