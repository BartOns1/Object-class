package be.vdab.bees;


import java.util.Random;

/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Egg {
    private int size;

    public int getSize() {
        return size;
    }

    public int getIncubatinoStatus() {
        return incubatinoStatus;
    }

    private int weight=0;
    private int incubatinoStatus;
    private Random rand = new Random();

    public Egg(){
        size = rand.nextInt(50);
        weight = rand.nextInt(20);
        incubatinoStatus=rand.nextInt(100);
    }

    public int getWeight() {
        return weight;
    }
    public void reduceIncubatinoStatus(){
        incubatinoStatus=incubatinoStatus-1;
    }

}
