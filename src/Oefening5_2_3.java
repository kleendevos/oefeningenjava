import java.util.Scanner;

/**
 * Created by vdabcursist on 13/06/2017.
 */
public class Oefening5_2_3 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        String naam = sc.nextLine();
        int personeelsnummer = sc.nextInt();
        double urengewerkt = sc.nextDouble();
        int uurloon = sc.nextInt();


        if (urengewerkt<40){
            double resultaat = uurloon * urengewerkt;
        } else {
            double resultaat = (uurloon * 40)+((urengewerkt-40)*(uurloon*1.5));
        }

    }
}
