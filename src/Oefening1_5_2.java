
public class Oefening1_5_2 {
    public static void main (String [] args){

        double afstand = 14;
        double minuten = 45;
        double seconden = 30;

        double tijdinuren = Tijdinuren.calculator(minuten,seconden);

        double eindresultaat = Mijlperuur.calculator(afstand,tijdinuren);
        double eindresultaatafgerond = Math.round (eindresultaat*100.0)/100.0;

        System.out.println("Als een loper 14 km per uur loopt in 45 minuten en 30 seconden dan loopt hij "+ eindresultaatafgerond + " mijl/uur");
    }
}
