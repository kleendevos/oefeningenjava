import java.util.Scanner;

public class Oefening5_2_3 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("NAAM: ");
        String naam = sc.nextLine();
        System.out.println("PERSONEELSNUMMER: ");
        int personeelsnummer = sc.nextInt();
        System.out.println("GEWERKTE UREN: ");
        double urengewerkt = sc.nextDouble();
        System.out.println("GEWERKTE MINUTEN: ");
        double minutengewerkt = sc.nextDouble();
        System.out.println("UURLOON: ")
        int uurloon = sc.nextInt();
        
        double totaalgewerkteuren = ((urengewerkt * 60) + minutengewerkt)/60


        if (totaalgewerkteuren<=40){
            double resultaat = uurloon * totaalgewerkteuren;
            System.out.println ("MAANDLOON =" + resultaat);
        } else {
            double resultaat = (uurloon * 40)+((totaalgewerkteuren-40)*(uurloon*1.5));
            System.out.println ("MAANDLOON =" + resultaat);
        }

    }
        
}
