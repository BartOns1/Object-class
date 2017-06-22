package ShapesExerc7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;


    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
        this("red",true);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString(){
        String fill;
        if (isFilled()==true){
            fill = "filled";
        }
        else {
            fill = "Not filled";
        }


        return ("A shape with color of " + getColor() + " and " + fill);
    }

}
