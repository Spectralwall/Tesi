import java.util.ArrayList;

public abstract class Phase {
    private Task task;
    private boolean attiva;
    private ArrayList<Professore> profList;
    private ArrayList<Materiale> materialList;
    private String descrizione;
    private ArrayList<Bambino> childList;

    public Phase(String descrizione,String descrizioneTask){
        this.descrizione = descrizione;
        this.task = new Task(descrizioneTask);
        attiva = false;
        profList = new ArrayList<>();
        materialList = new ArrayList<>();
        childList = new ArrayList<>();
    }

    //metodo che ritorna la prossima fase
    abstract Phase nextPhase();

    public String getDescrizione() {
        return descrizione;
    }

    public Task getTask() {
        return task;
    }

    public void completeTask() {
        task.setComplete(true);
    }

    public ArrayList<Bambino> getChildList() {
        return childList;
    }

    public ArrayList<Materiale> getMaterialList() {
        return materialList;
    }

    public ArrayList<Professore> getProfList() {
        return profList;
    }

    public void attivaPhase(){
        this.attiva = false;
    }

    public void disattivaPhase(){
        this.attiva = false;
    }

    public boolean isAttiva() {
        return attiva;
    }

}
