package CollectorExercises13;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Comparator;
/**
 * Created by barto on 23/06/2017.
 */
public class CompareX implements Comparator<Point> {
    Point P = new Point(0,0);

    public Point getP() {
        return P;
    }

    public void setP(Point p) {
        P = p;
    }

    @Override
    public int compare(Point o1, Point o2) {
        int verschil =((int)(Math.round(o1.getX()*1000-o2.getX()*1000)));
        if (verschil!=0) return verschil; else return ((int)Math.round(o1.getY()*1000-o2.getY()*1000));
    }
}
