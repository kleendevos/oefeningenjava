import java.text.DecimalFormat;

/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening1_5 {
    public static void main (String [] args){
        int distancek = 14;
        double time = 45.5;
        float kperh = (float) ((distancek/time)*60);
        float mperh = (float) (kperh/1.6);

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Als een loper 14 km per uur loopt in 45 minuten en 30 seconden dan loopt hij " + f.format(kperh) + " km/uur of "+ f.format(mperh) + " mijl/uur.");
    }
}
