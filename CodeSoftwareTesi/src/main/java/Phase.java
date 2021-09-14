import java.util.ArrayList;

public abstract class Phase {
    private Task task;
    private boolean attiva;
    private ArrayList<Professore> profList;
    private ArrayList<Materiale> materialList;
    private String descrizione;
    private ArrayList<Bambino> childList;
    private String nomeFase;

    public Phase(String nome,String descrizione,String descrizioneTask){
        this.descrizione = descrizione;
        this.task = new Task(descrizioneTask);
        attiva = false;
        profList = new ArrayList<>();
        materialList = new ArrayList<>();
        childList = new ArrayList<>();
        this.nomeFase = nome;
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

    public void addProf(Professore a){
        profList.add(a);
    }

    public void addChild(Bambino a){
        childList.add(a);
    }

    public void addMaterial(Materiale a){
        materialList.add(a);
    }

    @Override
    public String toString() {
        return "Phase{" +
                "task=" + task +
                ", attiva=" + attiva +
                ", profList=" + profList +
                ", materialList=" + materialList +
                ", descrizione='" + descrizione + '\'' +
                ", childList=" + childList +
                ", nomeFase='" + nomeFase + '\'' +
                '}';
    }
}
