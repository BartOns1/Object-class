package CollectorExercises13;

import java.util.PriorityQueue;

/**
 * Created by barto on 24/06/2017.
 */
public class MyPriorityCue extends PriorityQueue implements Cloneable {
    public MyPriorityCue() {
    }

    public MyPriorityCue clone(MyPriorityCue pc){
        return pc;
    }
}
