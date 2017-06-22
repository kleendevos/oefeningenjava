package be.vdab.Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kathleendevos on 21/06/17.
 */
public class Oefening11_1 {
    public static void main(String[] args) {

        int i;
        int j;


        Scanner s = new Scanner(System.in);
       // System.out.print("Geef een getal: ");



        do {

            try {
                System.out.print("Geef getal 1: ");
                i = s.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Fout! Input is geen getal! Try Again");
                s.next();
            }

        } while (true);

        do {
            try {
                System.out.print("Geef getal 2: ");
                j = s.nextInt();
                break;

            }catch (InputMismatchException e){
                System.out.println("Fout! Input is geen getal! Try Again");
                s.next();
            }
        } while (true);
        System.out.println(i + " + " + j +  " = " + (i+j));

    }



}



