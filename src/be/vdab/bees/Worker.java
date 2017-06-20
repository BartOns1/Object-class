/**
 * Created by vdabcursist on 15/06/2017.
 */

package be.vdab.bees;

public class Worker extends Bee{
    private int capacity; //enkel de werker kan prutsen aan eigen capaciteit
    private int carriage = 0; //heet member variabel
    private String name;

    public Worker(String name, int capacity, int carriage){
        super(name);
        this.capacity =  capacity;
        this.carriage = carriage;
        if(capacity<0){
            capacity=0;
        }
        this.capacity=capacity;
    }

    public Worker(String name){
         this(name,0,0);
    }

    public Worker(String name, int capacity){ // constructor heeft geen andere output type dan de klasse zelf, dus geen void of int ...: je moet naam van klasse gebruiken met hoofdletter;
        this(name, capacity,0);
    }


    public boolean gatherNectar(int howmuch){
        System.out.println("Worker " + name + " is gathering some nectar");
        carriage +=howmuch;
        if (carriage==capacity) {
            System.out.println(name + " is full.");
            return false;
            } else {
            System.out.println(name + " has " + (capacity-carriage) + " left.");
            return true;
        }
    }
    public int getCapacity() {  //getter and setter heet property
        return capacity;
    }

    public void setCapacity (int newCapacity){
        if (newCapacity<0){
            this.capacity=0; //this. is hier overbodig , enkel nodig wanneer lokaal argument dezelfde naam heeft als de var in de klasse: this.var verwijst naar var in de klasse
        }
        this.capacity = newCapacity;
    }




}
