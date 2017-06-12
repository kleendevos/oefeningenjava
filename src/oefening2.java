import java.util.Scanner;

public class oefening2 {
    public static void main (String [] args){
        System.out.println("wat is je naam?");
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();

        System.out.println("wat is je leeftijd?");
        Scanner s = new Scanner (System.in);
        int age;
        age = Integer.parseInt(s.nextLine());

        System.out.println("Dag"+" "+input+"! "+"Volgend jaar ben je "+ (age + 1)+"." );

    }
}