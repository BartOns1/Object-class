/**
 * Created by vdabcursist on 28/06/2017.
 */
public class ExampleThread {
    public static void main(String[] args) {

        Thread t = new Mythread();
        //t.run(); //rouky mistake
        t.start();//create and launch new thread and start executing run()
        System.out.println("run from main thread");



        //2de manier
        Runnable k = new Cat();
        Thread kt = new Thread(k, "the cat whispers thread");
        kt.start();


        System.out.println(kt.getId());
        System.out.println(kt.getName());

        new Thread(k, "a").start();
        new Thread(k,"b").start();
        new Thread(k,"c").start();
    }

}


class Mythread extends Thread{
    public void run(){
        Thread me = Thread.currentThread();//ref naar eigen thread
        System.out.println(me + "in execution:" +me.getName());
    }
}

class Cat implements Runnable{
    public void run(){
        Thread me = Thread.currentThread();//ref naar eigen thread
        System.out.println(me + "in execution:" +me.getName());
    }

    /**
     * Created by vdabcursist on 28/06/2017.
     */

}