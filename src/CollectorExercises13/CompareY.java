package CollectorExercises13;

import java.util.Comparator;

/**
 * Created by barto on 23/06/2017.
 */
public class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        int verschil = ((int)Math.round(o1.getY()*1000-o2.getY()*1000));
        if (verschil!=0) return verschil; else return ((int)Math.round(o1.getX()*1000-o2.getX()*1000));
    }
}
