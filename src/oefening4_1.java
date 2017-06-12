/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening4_1 {
    public static void main (String [] algs){
        long secondsday = 86400;
        long birth = 7;
        long death = 13;
        long immigrants = 45;
        long total = 312032486;

       long sec5year = secondsday*365*5;

       long birthtotal = sec5year/birth;
       long deathtotal = sec5year/death;
       long immigrantstotal = sec5year/immigrants;

       long total5year = total + birthtotal - deathtotal + immigrantstotal;

       System.out.println(total5year);
    }
}
