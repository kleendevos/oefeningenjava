import java.text.DecimalFormat;


public class oefening1_5_1 {
    public static void main (String [] args){
        double distancek = 14;
        double time = 45*60+30;
        int aantalsecondenperuur = 3600;

        double tijdinuren = time/(double) aantalsecondenperuur;


        double kperh = (distancek/tijdinuren);
        double mperh = (kperh/1.6);

        double eindresultaat = Math.round(mperh * 100)/100.0; // .0 moet toegevoegd worden omdat anders de getallen na de comma worden weggelaten en er in long wordt verdergewerkt ipv double.

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Als een loper 14 km per uur loopt in 45 minuten en 30 seconden dan loopt hij " + f.format(kperh) + " km/uur of "+ eindresultaat + " mijl/uur.");
    }
}
