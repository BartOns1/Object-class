package ShapesExerc7_3;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class Cilinder{
    private double height;
    private Circle base;

    public Cilinder(double height, Circle base){
        this.height = height;
        this.base = base;
    }
    public Cilinder(double height, double radius){
        this.height=height;
        this.base = new Circle(radius);
    }
    public double volume(){
        return base.calculateArea() * height;
    }
}
