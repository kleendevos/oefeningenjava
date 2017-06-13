import java.util.Scanner;

public class oefening5_1 {
    public static void main(String []algs) {

        System.out.println("ENTER YOUR FIRSTNAME and LASTNAME: ");
        Scanner s = new Scanner(System.in);
        String Name = s.nextLine();

        int firstSpace = Name.indexOf(" ");
        String firstName = Name.substring(0, firstSpace);
        String lastName = Name.substring(firstSpace).trim();


        System.out.println ("FIRSTNAME: " + firstName);
        System.out.println ("LASTNAME: " + lastName.toUpperCase());
    }

}
