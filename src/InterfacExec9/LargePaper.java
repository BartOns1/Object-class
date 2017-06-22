package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public class LargePaper extends Paper {
    private String paperwidth;

    public LargePaper() {
    }

    @Override
    public String getPaperformat() {
        return this.paperwidth;
    }
}
