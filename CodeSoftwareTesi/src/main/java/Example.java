public class Example extends Phase{

    private Phase nextPhase;

    public Example(String descrizione, String descrizioneTask,Phase next) {
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
