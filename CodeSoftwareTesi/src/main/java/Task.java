public class Task {
    private Boolean complete;
    private String descrizione;

    public Task(String descrizione){
        this.descrizione = descrizione;
        complete = false;
    }

    public Boolean getComplete() {
        return complete;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
