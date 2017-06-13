import java.util.Scanner;

/**
 * Created by vdabcursist on 13/06/2017.
 */
public class oefening4_3 {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Geef waarde op voor A");
        double a = s.nextDouble();
        System.out.println("Geef waarde op voor B");
        double b = s.nextDouble();
        System.out.println("Geef waarde op voor C");
        double c = s.nextDouble();
        System.out.println("Geef waarde op voor D");
        double d = s.nextDouble();
        System.out.println("Geef waarde op voor E");
        double e = s.nextDouble();
        System.out.println("Geef waarde op voor F");
        double f = s.nextDouble();
        //mag ook naast elkaar staan met komma's ertussen


        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);

        System.out.println("X = " + x + " en Y = " + y);




    }
}
