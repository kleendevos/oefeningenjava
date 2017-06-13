import java.util.Scanner;

/**
 * Created by vdabcursist on 13/06/2017.
 */
public class Oefening5_2_2 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Print Number in Words: ");
        int getal = sc.nextInt();

        switch (getal){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
