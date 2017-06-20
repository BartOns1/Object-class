package be.vdab.bees;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vdabcursist on 15/06/2017.
 */



public class Queen extends Bee{
    private boolean hunger=false;
    private int power = 1000;
    private int powerconsumption = 0;
    Random num = new Random();
    public int capacity = 0;

    public Queen(String name) {
        super(name);
    }

    public Egg[] layEggs(int aantal) {
        Egg[] serieEggs = new Egg[aantal];
        for (int i = 0; i < aantal; i++) {
            serieEggs[i] = new Egg();
        }


        power=power-calculatePowerconsumption(serieEggs);
        return serieEggs;
         }

   // public Queen(String name, int capacity, int capacity){
    //    super(name) = name;
    //    this.capacity = capacity;

    //}

    public int getPower() {
        System.out.printf("Power = %d\n", power);
        return power;
    }

    public boolean checkHunger(){
        if (power<=0) {
            hunger=true;
        } else {
            hunger=false;
        }
        System.out.printf("The queen hungerstatus is %B\n", hunger);
        System.out.printf("The current power is %d\n", power);
        System.out.println();
        return hunger;
    }

    private int calculatePowerconsumption(Egg[] serieEggs){
        powerconsumption=0;

       // int totalWeight = Arrays.stream(serieEggs).mapToInt((Egg e) -> e.getWeight()).reduce(0, (int c, int p) -> c + p );lambda taal doet zelfde als loop

        for (int i=0; i<serieEggs.length; i++){
            int telbij=serieEggs[i].getWeight();
            powerconsumption=powerconsumption + telbij;
        }
        return powerconsumption;
    }
    public void reduceincub(Egg[] Eggs){
        for (int i=0; i<Eggs.length; i++){
            Eggs[i].reduceIncubatinoStatus();
        }
        for (int i=0; i<Eggs.length; i++){
            if (Eggs[i].getIncubatinoStatus()==0){
                System.out.printf("Eg %d hatched", i);
            }
    }
}

    public void eat(){
        int food = num.nextInt(1000);
        System.out.printf("Theresa is eating %d nursers\n", food);
        power=power+food;
        System.out.printf("Power is %d\n",power);

    }
}
