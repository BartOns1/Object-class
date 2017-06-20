package ShapesExerc7_3;

import java.util.concurrent.Callable;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class execr7_3test {
    public static void main(String[] args){
        Shape c = new Circle();
        Shape r = new Rectangle();

        double side = 5.3d;
        Rectangle square = new Square(side);

        System.out.printf("area is %.2f\n", square.calculateArea());
        System.out.printf("area is %.2f\n",  square.calculatePerimeter());

        System.out.printf("%s\n",square.toString());
        System.out.printf("%s\n",c.toString());
        System.out.printf("%s\n",r.toString());

    }
}
