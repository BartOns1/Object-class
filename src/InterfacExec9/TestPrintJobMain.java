package InterfacExec9;

/**
 * Created by barto on 22/06/2017.
 */
public class TestPrintJobMain {
    public static void main(String[] args){
        Paper papier = new FotoPaper();
        Sweater pullover = new Sweater("red");
        Trousers bloesken = new Trousers();
        Trousers broekske = new Trousers();
        FotoPaper klikske = new FotoPaper();
        klikske.setPicture("gene hond ma a poeske");
        klikske.AskforGlossy("true");

        Printer P = new Printer();



        pullover.setPattern("streepjes");
        P.print(pullover);
        P.print(klikske);

        klikske.AskforGlossy("y");
        P.print((klikske));

        //P.print(broekske);
        broekske.print();
    }
}

//Bij de interface was de methode void print() gedefinieerd zonder argumenten.
// Als ik de interface impleenteerde moest ik de methode print opdezelfde manier implementeren zonder argumenten.
// Kan ik een override doen van die methode?
