public class ParteEsperienziale extends Phase{
    private Phase nextPhase;

    public ParteEsperienziale(String descrizione, String descrizioneTask,Phase next) {
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
