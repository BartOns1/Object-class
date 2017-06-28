package ExampleThread.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Mutexes {
}

class results {
    private String winner;



    Lock muttex = new ReentrantLock();

    public String getWinner() {//readerslock, als er enkel lezers zijn moeten er geen wachtrijen zijn, ander soort van synchronize
       muttex.lock();
        //muttex.trylock  om te kijken of een andere thread bezig, indien niet dan uitvoeren, indien wel, dan i.p.v. wachten iets anders gaan uitvoeren
       //code
        muttex.unlock();
        return winner;


    }

    public synchronized void setWinner(String winner) {//writelocker
        muttex.lock();
        this.winner = winner;//hierdoor kan maar 1 thread een set doen
        muttex.unlock();
        }
}
