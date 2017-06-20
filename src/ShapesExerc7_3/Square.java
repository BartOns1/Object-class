package ShapesExerc7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Square extends Rectangle {
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public Square(double side){
        super(side, side);
    }

    public Square(){
        super(1d,1d);
    }

    public void setWidth(double side){
        setWidth(side);
        setLength(side);
    }

    public  void setLength(double side){
        setLength(side);
        setWidth(side);
    }

    public double gethide(){
        return getWidth();
    }

    public String toString(){
        return "A Square with side = " + getWidth() + " which is a subclass of " + super.toString();
    }
}
