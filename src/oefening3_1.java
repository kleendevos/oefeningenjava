import java.util.Scanner;

public class oefening3_1 {
    public static void main (String [] args) {
        System.out.println("Voer 3 verschillende getallen in:");
        Scanner s = new Scanner (System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();

        double som = a+b+c;
        double average = som/3;
        double product = a*b*c;


        System.out.println("Bewerkingen");
        System.out.println("SOM  " +Math.round(som));
        System.out.println("GEMIDDELDE  "+ Math.round(average));
        System.out.println("PRODUCT  " + Math.round(product));

        if (a>b&&a>c)
            System.out.println ("HET GROOTSTE GETAL IS "+ a);
        if (b>a&&b>c)
            System.out.println ("HET GROOTSTE GETAL IS "+ b);
        if (c>a&&c>b)
            System.out.println ("HET GROOTSTE GETAL IS "+ c);
        if (a<b&&a<c)
            System.out.println ("HET KLEINSTE GETAL IS " + a);
        if (b<a&&b<c)
            System.out.println ("HET KLEINSTE GETAL IS " + b);
        if (c<a&&c<b)
            System.out.println ("HET KLEINSTE GETAL IS " + c);


    }
}
