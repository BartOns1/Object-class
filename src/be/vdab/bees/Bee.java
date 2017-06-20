package be.vdab.bees;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public abstract class Bee { //door abstract kan je geen objecten van Bee aanmaken, maar wel van de onderliggende concrete klassen: zo kan je enkel een queen, worker, nurse aanmaken
    protected String name;

    public Bee(String name){
        this.name = name;
    }

    public void  fly(){
        System.out.println("Bee is flying around a bit...");
    }

    public String getName(){
        return name;
    }


}
