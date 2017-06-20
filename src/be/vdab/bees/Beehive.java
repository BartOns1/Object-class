/**
 * Created by vdabcursist on 15/06/2017.
 */
package be.vdab.bees;

public class Beehive {
    public static void main(String[] args){
        Worker maya = new Worker("Maya",200);
        Worker bob = new Worker("Bob",100);
        Worker metje = new Worker("Metje");
        Egg[] Eggs;
        Egg[] Alleggs = new Egg[10000];
        int pos;

       // System.out.printf(" Cappacity = %d\n", maya.getCapacity());
        for(int i=1; i<3; i++){
       //     maya.gatherNectar(11);
        }
        bob.getCapacity();
        System.out.println();
        System.out.println();
        System.out.println();




        Queen theresa= new Queen("Theresa");

        //while (theresa.getPower()>-1000) {
            theresa.checkHunger();
            Eggs = theresa.layEggs(100);
          //  for (int i = 0; i < Eggs.length; i++) {
                //pos=Alleggs.length - 1 + i;
                //System.out.printf(" test %d", pos);
                //Alleggs[pos] = Eggs[i];
            //}

            theresa.checkHunger();
            Eggs = theresa.layEggs(100);
            theresa.checkHunger();

            theresa.eat();
            while (theresa.getPower() < 0) {
                theresa.eat();
            }

            Eggs = theresa.layEggs(20);
            theresa.checkHunger();
            theresa.reduceincub(Alleggs);


        //}


    }
}
