package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public class Sweater extends Clothes implements PrintJob{
    private String color;
    private String pattern;

    public Sweater(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotive() {
        return pattern;
    }

    public void setPattern(String motive) {
        this.pattern = motive;
    }

    public void print(){
        System.out.printf("The sweater is printed with the pattern %s.\n", pattern);
    }

}
