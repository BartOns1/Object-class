package ShapesExerc7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;

    }
    public Rectangle() {
        this(1, 1);

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea(){ //not using getArea because of possible confusion with getter
        return width*length;
    }

    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public String toString (){
        return "A rectangle with width = " + getWidth() + " and length = " + getLength() + " which is a subclass of " + super.toString();
    }
}
