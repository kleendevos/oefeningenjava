package be.vdab.kathleen;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class oefening {

    public static final String DEFAULT_NAME1 = new String ("John Doe");
    public static final String DEFAULT_NAME = "john Doe";

    // zelfde manier van noteren!


    public static void main (String [] args){
        String name = "Jimi";
        String name1 = new String ("Jimi");


        // int i = 5;
        Integer i = new Integer (5);
        Integer i2 = Integer.parseInt("123");
        /* i en integer is zelfde maar met integer zijn er meer mogelijkheden achteraan.  ook mogelijk voor Long
        Double - Charachter - Float -  Short - Byte -
        na een punt kunnen er allerlei methods komen die kunnen helpen bij het omzetten van oefeneningen.
        Warpper types zijn veel trager dus best niet altijd te gebruiken

        = Wrapper-Class


         */

        int j = i;
        int j2 = i.intValue();
         /* int i zonder waarde heeft waarde 0 terwijl integer i zonder waarde de waarde NULL heeft en hier kan je
         niet mee rekenen.  Dit zorgt voor het crashen van je applicatie.
          */

         Boolean k = true;


    }


}
