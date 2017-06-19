package be.vdab.animals;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class list {
    public static void main (String [] args){
        cat c = new cat("corn Flakes");
        c.sound();

        dog d = new dog ("Black");
        d.sound();

        animal a = new cat("fish");
        a.sound();

        animal k = new dog("bobje");
        k.sound();

        animal b = c;
        b.sound();


            }
        }

