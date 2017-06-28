import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        List<MessangerThread> treads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MessangerThread t = new MessangerThread();
            treads.add(t);
            t.start();
            t.join();
        }

        System.out.println("thread active " + Thread.currentThread().getName());
    }
}

class MessangerThread extends Thread {
    public void run(){
        for(int i=0; i<20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Who dares to wake me");
            }

        }
    }
}
