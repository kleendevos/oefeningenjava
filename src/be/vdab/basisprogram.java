package be.vdab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class basisprogram {
    public static void main(String[] algs) {

        Scanner s = new Scanner(System.in);
        System.out.print("Geef een getal op: ");
        try {
            int getal = s.nextInt();
            System.out.println("het gekozen getal is: " + getal);

        }catch(InputMismatchException e){
            System.out.println("er is een fout gebeurd!");
        }

    }
}








