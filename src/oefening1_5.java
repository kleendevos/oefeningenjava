import java.text.DecimalFormat;


public class oefening1_5 {
    public static void main (String [] args){
        double distancek = 14;
        double time = 45.5;
        double kperh = (distancek/time)*60;
        double mperh = (kperh/1.6);

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Als een loper 14 km per uur loopt in 45 minuten en 30 seconden dan loopt hij " + f.format(kperh) + " km/uur of "+ f.format(mperh) + " mijl/uur.");
    }
}
