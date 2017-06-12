import java.util.Scanner;

/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening3_2 {
    public static void main (String []algs){
        System.out.println("Voer 2 getallen in:");
        Scanner s = new Scanner (System.in);
        int a;
        a = s.nextInt();

        Scanner t = new Scanner (System.in);
        int b;
        b = t.nextInt();



        if(a>b)
            System.out.println("HET GROOTSTE GETAL IS "+a);
        if(b>a)
            System.out.println("HET GROOTSTE GETAL IS "+b);
        if(b==a)
            System.out.println("DE GETALLEN ZIJN GELIJK");


    }
}
