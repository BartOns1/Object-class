package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public class Printer {
    private int que=1;
    Sweater bloes = new Sweater("groen");

    public Printer() {
    }

    public void print(PrintJob trui) {
            trui.print();
        }

}
