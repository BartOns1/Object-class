package CollectorExercises13;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by barto on 23/06/2017.
 */
public class TestPoint {
    public static void main(String[] args){
        ArrayList<Point> points = new ArrayList<>();

        for(int i=0;i<100;i++){
            Point P = new Point(Math.random(),Math.random());
            points.add(P);
        }

        Collections.sort(points, new CompareX());

        for(int i=0;i<100;i++){
           System.out.println(points.get(i).showCord());
        }

        Collections.sort(points, new CompareY());

        for(int i=0;i<100;i++){
            System.out.println(points.get(i).showCord());

        }

    }
}
