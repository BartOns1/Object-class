package ShapesExerc7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Circle extends Shape {
    private double radius=1d;

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(){
        super();
        this.radius = 1d;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double area = Math.PI*Math.pow(getRadius(),2);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = Math.PI*getRadius()*2;
        return perimeter;
    }

    public String toString(){
        return "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}

