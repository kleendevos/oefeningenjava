package be.vdab.Thread;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Athlete extends Thread {
    private String name;
    private Object shot;


    public Athlete(String name1, Object shot) {
        this.name = name1;
        this.shot = shot;
    }

    public void run (){

        int distance = 0;
        int distancewinner = 100;

        while (distance < 100) {
            distance += step();
            System.out.println(name + " liep al " + distance + " meter");
            trager();
        } if (distance == 100){
            System.out.println ('\t' + name + " FINISHED");
        }
        

    }

    private double step() {
        int min = 1;
        int max = 3;
        return min + Math.random()*(max - min);
    }


    private void trager(){
        try {
            Thread.sleep(200);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*private void waitUntilGo() throws IllegalAccessException {
        synchronized (signal) {
            try {
                signal.wait();
            } catch (InterruptedException e) {
                throw new IllegalAccessException ();*/
            }

