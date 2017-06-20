package ShapesExerc7_3;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class Circle2 implements GeometricObject {
    protected double radius= 1d;

    public Circle2(double radius){
        this.radius=radius;
    };
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
