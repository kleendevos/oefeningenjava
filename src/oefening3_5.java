import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening3_5 {
    public static void main (String[] args){
        double sugar = 2;
        double butter = 1;
        double flour = 2.75;

        double sugar1 = sugar/48;
        double butter1 = butter/48;
        double flour1 =flour/48;


        System.out.println("HOW MANY COOKIES WOULD YOU LIKE TE MAKE: ");
        Scanner input = new Scanner (System.in);
        int N;
        N = input.nextInt();

        double sugarN = sugar1*N;
        double butterN = butter1*N;
        double flourN = flour1*N;

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("FOR THIS AMOUNT OF COOKIES YOU'LL NEED THE FOLLOWING INGREDIENTS: ");
        System.out.println("SUGAR :"+f.format(sugarN)+" CUPS");
        System.out.println("BUTTER :"+f.format(butterN)+" CUPS");
        System.out.println("SUGAR :"+f.format(flourN)+" CUPS");
    }
}
