package CollectorExercises13;
import java.lang.Comparable;
/**
 * Created by barto on 23/06/2017.
 */
public class Point {
    private double x = 0;
    private double y = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

     public String showCord() {
        String s = "(" + this.getX() + "," + this.getY() + ")";
        System.out.println(s);
        return s;
     }
}
