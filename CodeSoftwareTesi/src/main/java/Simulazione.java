import java.util.Scanner;

public class Simulazione {

    public static void main(String[] args) {
        //definiamo la lezione
        Lezione lesson1 = new Lezione("Lezione1","Lezione per agenti inteligenti","Apprendimento dei bambini");

        //definiamo le fasi di una lezione
        Questione questione1 = new Questione("questione1","chiediamo ha bambini sull'argomento","vogliamo che i bambini capiscano la domanda");
        Example esempio1 = new Example("esempio1","Mostriamo come si svolge l'attivitá","vogliamo che i bambini capiscano l'attivitá");
        ParteEsperienziale esperienza1 = new ParteEsperienziale("esperienza1","Facciamo svolgere l'attivitá hai bambini",
                "vogliamo che i bambini si divertano e partecipino");
        ParteRiflessiva riflessione1 = new ParteRiflessiva("riflessione1","Facciamo riflettere i bambini sull'attivitá svolta",
                "vogliamo che i bambini riflettano utti insieme");
        AutoRiflessione auto1 = new AutoRiflessione("auto1","Facciamo riflettere i bambini da soli",
                "vogliamo pensino a cosa hanno fatto ");

        //definiamo i professore della lezione
        Professore prof1 = new Professore("Cristina","Baroglio","Responsabilelezione");
        Professore prof2 = new Professore("Sara","Capecchi","Assistentelezione");

        //definiamo il materiale della lezione
        Materiale oggetto1 = new Materiale("banco magico");
        Materiale oggetto2 = new Materiale("Dizionario");

        //definiamo i bambini della lezione
        Bambino bambino1 = new Bambino("Gabriele","Assistente professore");
        Bambino bambino2 = new Bambino("Edoardo","Investigatore");
        Bambino bambino3 = new Bambino("Laura","Addetta al banco magico");

        //diamo a ogni fase la fased successiva
        questione1.setNextPhase(esempio1);
        esempio1.setNextPhase(esperienza1);
        esperienza1.setNextPhase(riflessione1);
        riflessione1.setNextPhase(auto1);
        auto1.setNextPhase(null);

        //assegnamo a ogni fase i professori, bambini e materiali
        questione1.addProf(prof1);
        questione1.addProf(prof2);
        questione1.addChild(bambino1);

        esempio1.addProf(prof1);
        esempio1.addProf(prof2);
        esempio1.addChild(bambino1);
        esempio1.addMaterial(oggetto1);
        esempio1.addMaterial(oggetto2);
        //.....

        //diamo alla lezione la prima fase
        lesson1.setPhase(questione1);

    }
}
