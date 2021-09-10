public class Questione extends Phase{

    private Phase nextPhase;

    public Questione(String descrizione, String descrizioneTask,Phase next) {
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
