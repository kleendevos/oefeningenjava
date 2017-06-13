import java.util.Scanner;

public class Oefening6 {
    public static void main (String [] args){

        Scanner sc = new  Scanner (System.in);
        System.out.println ("Voer een willerkeurig getal in tussen 0 en 10 :");
        int getal = sc.nextInt();

        if (getal>=5) {
            System.out.println("Big Number");
        } else {
                System.out.println("Small Number");
        }

        switch (getal){
            case 1:
                System.out.println ("One");
                break;
            case 2:
                System.out.println ("Two");
                break;
            default:
                System.out.println ("other");
        }
    }
}
