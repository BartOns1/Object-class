package InterfacExec9;

/**
 * Created by barto on 21/06/2017.
 */
public abstract class Paper {
    private String paperformat = "A4";
    private String color = "red";
    private double thickness = 1;
    private String quality = "high";


    public String getPaperformat() {
        return paperformat;
    }

    public void setPaperformat(String paperformat) {
        this.paperformat = paperformat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        thickness = thickness;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }



    public void showPaper(String paperformat, String color, double thickness){
        System.out.printf("The paper in the que is of format %s and color %s and has thickness %f.\n",paperformat, color, thickness);
    }
}
