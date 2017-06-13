import java.util.Scanner;

public class oefening3_3 {
    public static void main (String []algs){
        Scanner input = new Scanner (System.in);

        System.out.println("ENTER YOUR FIRSTNAME: ");
        String Name = input.nextLine();

        System.out.println("ENTER YOUR MIDDLENAME: ");
        String Middlename= input.nextLine();

        System.out.println("ENTER YOUR LASTNAME: ");
        String Lastname= input.nextLine();

        System.out.println("YOUR INITIALS ARE");

        char c= Name.charAt(0);
        char d= Middlename.charAt(0);
        char e= Lastname.charAt(0);

        System.out.println (c+" . "+d+" . "+e);
    }
}
