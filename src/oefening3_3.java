import java.util.Scanner;

/**
 * Created by kathleendevos on 12/06/17.
 */
public class oefening3_3 {
    public static void main (String []algs){
        String Name = new String();
        System.out.println("ENTER YOUR FIRSTNAME: ");
        Scanner input = new Scanner (System.in);
        Name = input.nextLine();

        String Middlename = new String ();
        System.out.println("ENTER YOUR MIDDLENAME: ");
        Scanner input2 = new Scanner (System.in);
        Middlename = input2.nextLine();

        String Lastname = new String ();
        System.out.println("ENTER YOUR LASTNAME: ");
        Scanner input3 = new Scanner (System.in);
        Lastname = input3.nextLine();

        System.out.println("YOUR INITIALS ARE");

        char c= Name.charAt(0);
        char d= Middlename.charAt(0);
        char e=Lastname.charAt(0);

        System.out.println (c+" . "+d+" . "+e);
    }
}
