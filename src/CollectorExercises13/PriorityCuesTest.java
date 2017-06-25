package CollectorExercises13;

import jdk.nashorn.internal.ir.SetSplitState;

import java.util.PriorityQueue;

/**
 * Created by barto on 24/06/2017.
 */
public class PriorityCuesTest {
    public static void main(String[] args) {
        PriorityQueue<String> names1 = new PriorityQueue<>();
        PriorityQueue<String> names2 = new PriorityQueue<>();

        names1.add("George");
        names1.add("Jim");
        names1.add("Jhon");
        names1.add("Blake");
        names1.add("Kevin");
        names1.add("Micheal");

        names2.add("George");
        names2.add("Katie");
        names2.add("Kevin");
        names2.add("Michelle");
        names2.add("Ryan");

        PriorityQueue<String> intersection = new PriorityQueue<>(names1);
        intersection.retainAll(names2);

        PriorityQueue<String> union = new PriorityQueue<>(names1);
        union.addAll(names2);

        PriorityQueue<String> setdiff = new PriorityQueue<>(names1);
        setdiff.removeAll(names2);

        System.out.println(intersection);
        System.out.println(union);
        System.out.println(setdiff);


    }
}
