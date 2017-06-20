package ShapesExerc7_3;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class TestResizableCircle {
    public static void main(String[] args){
        Circle2 C = new Circle2(12);
        ResizableCircle RC = new ResizableCircle(10);

        System.out.printf("De perimeter is %f\n",C.getPerimeter());
        System.out.printf("De perimeter is %f\n",RC.getPerimeter());
        RC.resize(20);
        System.out.printf("De perimeter is %f\n",RC.getPerimeter());

    }

}
