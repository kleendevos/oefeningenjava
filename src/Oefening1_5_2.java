
public class Oefening1_5_2 {
    public static void main (String [] args){

        double afstand = 16;
        double minuten = 45;
        double seconden = 30;

        double tijdinuren = Tijdinuren.calculator(minuten,seconden);

        double eindresultaat = Mijlperuur.calculator(afstand,tijdinuren);
        double eindresultaatafgerond = Math.round (eindresultaat*100.0)/100.0;

        System.out.println("Als een loper "+ afstand + " km loopt in " + minuten + " minuten en " + seconden + " seconden dan loopt hij "+ eindresultaatafgerond + " mijl/uur");
    }
}
