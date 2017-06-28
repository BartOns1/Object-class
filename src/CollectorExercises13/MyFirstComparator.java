package CollectorExercises13;

import java.util.Comparator;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class MyFirstComparator implements Comparator<Point>{
    public int compare(Point a, Point b){
        if (a.getX() != b.getY()) {
            return (int) (a.getX() - b.getX());
        } else{
            return (int) (a.getY()-b.getY());
        }
    }
}
