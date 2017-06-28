package be.vdab.Thread;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Main {
    public static void main (String [] args){
        Thread t = new MyThread();

        t.start();

        System.out.println("Run from the main thread");

        Thread me = Thread.currentThread();
        System.out.println(me.getId() + " " + me.getName());
    }
}
