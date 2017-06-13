import java.util.Scanner;

public class oefening3_4 {
    public static void main (String []algs){

        int totalbiscuits = 40;
        int servings = 10;
        int caloriesperserving = 300;

        int calcookie = ((servings*caloriesperserving)/totalbiscuits);

        System.out.println("NUMBER OF BISCUITS YOU ATE: ");
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();


        int calories = (N*calcookie);

        System.out.println("YOU CONSUMED "+calories+" CALORIES IN TOTAL.");
    }
}
