import java.util.Scanner;

/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening5_1 {
    public static void main(String []algs) {

        String Name = new String();
        System.out.println("ENTER YOUR FIRSTNAME and LASTNAME: ");
        Scanner input = new Scanner(System.in);
        Name = input.nextLine();

        int firstSpace = Name.indexOf(" ");
        String firstName = Name.substring(0, firstSpace);
        String lastName = Name.substring(firstSpace).trim();


        System.out.println ("FIRSTNAME: " + firstName);
        System.out.println ("LASTNAME: " + lastName.toUpperCase());
    }

}
