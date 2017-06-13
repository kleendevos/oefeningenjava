/**
 * Created by vdabcursist on 13/06/2017.
 */
public class loop {
    public static void main (String [] args){
        int getal = 0;

        while (getal < 10) {
            System.out.println("GETAL IS "+ getal);
            getal++; // zelfde als getal = getal + 1
        }

        for (int i = 5; i < 10; i++) {
            System.out.println("GETAL IS "+ i);
        }
    }
}
