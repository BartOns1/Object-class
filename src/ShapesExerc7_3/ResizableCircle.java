package ShapesExerc7_3;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class ResizableCircle extends Circle2 implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent){
        radius = radius*percent/100d;
    }
}
