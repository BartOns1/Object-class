package ExampleThread.java;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Athlete  extends Thread{
    private String name;

    public Athlete(String name) {
        this.name = name;
    }

    int afstandGelopen = 0;
        public int step() {
            return (int) (3*Math.random()+1);
        }

        public void run(){
            while (afstandGelopen<100){
                afstandGelopen=afstandGelopen+step();
                swing();
                System.out.println(name + " stepped and ran " + afstandGelopen);
            }
            System.out.println(name + " Finisched FIRST");
            System.exit(0);
    }

    public void swing(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
