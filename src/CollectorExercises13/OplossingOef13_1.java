package CollectorExercises13;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/**
 * Created by vdabcursist on 28/06/2017.
 */
public class OplossingOef13_1 {
    public static void main(String[] args) {

        Comparator<Point> sortingCriterium =  new MyFirstComparator();
        Set<Point> points = new TreeSet<>();


        Point a = new Point(1,2);
        Point b = new Point(3,5);
        Point c = new Point(3,8);
        Point d = new Point(1,6);

        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);

        for (Point p:points){

        }
    }
}
