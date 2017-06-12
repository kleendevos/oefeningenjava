import java.util.Scanner;

public class oefening3 {
    public static void main (String [] args){
        System.out.println("a = ");
        Scanner s = new Scanner (System.in);
        int a;
        a = s.nextInt();

        System.out.println("b = ");
        Scanner t = new Scanner (System.in);
        int b;
        b = t.nextInt();

        System.out.println("b = ");
        Scanner l = new Scanner (System.in);
        int c;
        c = t.nextInt();

        System.out.println (a+"+"+b+"+"+c+"="+(a+b+c));

        double total = a+b+c;
        double average = total/3;


        System.out.println ("het gemiddelde is "+(Math.round(average)));


    }
}