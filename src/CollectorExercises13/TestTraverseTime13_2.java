package CollectorExercises13;

import java.util.LinkedList;
import java.util.Iterator;
/**
 * Created by barto on 24/06/2017.
 */
public class TestTraverseTime13_2 {
    public static void main(String[] args) {

        int maxL=50000;
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i =0; i < maxL; i++){
            ll.add(i);
        }

        Iterator itr = ll.iterator();

        double start = System.nanoTime();
        while(itr.hasNext()) {
            Object element = itr.next();
            //System.out.print(element + " ");
        }
        double tussenStop = System.nanoTime();

        for(int i = 0; i<maxL ; i++){
            Object element = ll.get(i);
        }

        double stop = System.nanoTime();
        String s1 = "De iterator doet er " + (tussenStop-start)/1000000d + " miliseconden over.";
        String s2 = "De forloop get(i) doet er " + (stop-tussenStop)/1000000d + " miliseconden over.";
        System.out.println(s1);
        System.out.println(s2);

//iterator lijkt heel efficient. Is dit voor linkedlist of ook voor andere collectors zoals hashlist en sets
    }


}
