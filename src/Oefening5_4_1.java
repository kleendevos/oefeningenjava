import java.util.Random;
import java.util.Scanner;

/**
 * Created by vdabcursist on 14/06/2017.
 */
public class Oefening5_4_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String playAgain = "";


        do {
            System.out.print("Geef minimumwaarde: ");
            int minimum = sc.nextInt();

            System.out.print("Geef Maximumwaarde: ");
            int maximum = sc.nextInt();

            int[] getal = new int[1];
            for (int a = 0; a < getal.length; a++) {

                Random r = new Random();
                int toguess = r.nextInt(maximum - minimum) + minimum;

                int[] guessing = new int[4];
                for (int b = 0; b < guessing.length; b++) {
                    System.out.print("GUESS ");
                    int geraden = sc.nextInt();

                    if (geraden > maximum || geraden < minimum) {
                        System.out.println("INVALID INPUT");
                    } else if (geraden == toguess) {
                        System.out.println("CONGRATZ YOU WON! THE NUMBER WAS " + toguess);
                        break;
                    } else if (geraden != toguess) {
                        System.out.println("SORRY, WRONG ANSWER!");

                    }

                }
                System.out.println("YOU RAN OUT OF GUESSES!  THE NUMBER WAS " + toguess);
            }
            System.out.println ("Would you like to play again (y/n)? ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
    }
}
