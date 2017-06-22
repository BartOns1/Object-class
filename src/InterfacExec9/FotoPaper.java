package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public class FotoPaper extends Paper implements PrintJob{
    private boolean glossy;
    private String picture;

    public boolean AskforGlossy(String answer) {
        if (answer == "y") {
            glossy = true;
        } else {
            glossy = false;
        }
        return glossy;
    }

    public boolean isGlossy() {
        return glossy;
    }

    public void setGlossy(boolean glossy) {
        this.glossy = glossy;
    }

    public String getPicture() {

        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }



    public void print() {
        if (glossy==true) {
            System.out.printf("The paper is printed with the picture of a %s on glossy paper\n", picture);
        } else {
            System.out.printf("The paper is prnited with the picture of a %s on plain paper\n", picture);
        }
    }


}
