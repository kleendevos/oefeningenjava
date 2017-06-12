import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening4_2 {
    public static void main (String [] algs){
        double interest = 0.00417;

        System.out.println("MONTHLY SAVING: ");
        Scanner input = new Scanner(System.in);
        double saving;
        saving = input.nextInt();

        double saving1 = saving*(1+interest);
        double saving2 = (saving1 + saving)*(1+interest);
        double saving3 = (saving2 + saving)*(1+interest);
        double saving4 = (saving3 + saving)*(1+interest);
        double saving5 = (saving4 + saving)*(1+interest);
        double saving6 = (saving5 + saving)*(1+interest);
        double saving7 = (saving6 + saving)*(1+interest);
        double saving8 = (saving7 + saving)*(1+interest);
        double saving9 = (saving8 + saving)*(1+interest);
        double saving10 = (saving9 + saving)*(1+interest);
        double saving11 = (saving10 + saving)*(1+interest);
        double saving12 = (saving11 + saving)*(1+interest);

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("AFTER 6 MONTHES YOUR ACCOUNT VALUE IS "+f.format(saving6));
        System.out.println("AFTER 12 MONTHS YOUR ACCOUNT VALUE IS "+f.format(saving12));
    }
}
