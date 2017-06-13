import java.util.Scanner;


public class oefening3_2 {
    public static void main (String []algs){
        System.out.println("Voer 2 getallen in:");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a>b)
            System.out.println("HET GROOTSTE GETAL IS "+a);
        if(b>a)
            System.out.println("HET GROOTSTE GETAL IS "+b);
        if(b==a)
            System.out.println("DE GETALLEN ZIJN GELIJK");


    }
}
