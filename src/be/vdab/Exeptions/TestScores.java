package be.vdab.Exeptions;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kathleendevos on 21/06/17.
 */
public class TestScores {

    public static void main(String[] args) throws InvalidTestScore {

        int[] testScores = new int[6];

        Scanner s = new Scanner(System.in);

        getTestscores(testScores);
        calculateAverage(testScores);
        //controletestscores(testScores);

        System.out.println();
        System.out.println("TESTSCORES: " + Arrays.toString(testScores));
        System.out.println("the Average Testscore is: " + calculateAverage(testScores));

    }

    public static int[] getTestscores(int[] testScores) {
        Scanner s = new Scanner(System.in);

        do {
        for (int i = 0; i < testScores.length; i++) {
            System.out.print("Enter Testscore " + i + ":");
            testScores[i] = s.nextInt();



                if (testScores[i] >= 100 || testScores[i] <= 0)

                {
                    try {
                        throw new InvalidTestScore("invalid value " + testScores[i] + " is not within the acceptable range of test scores 0 en 100");

                    } catch (InvalidTestScore a) {
                        System.out.println("invalid value " + testScores[i] + " is not within the acceptable range of test scores 0 en 100");
                        //break;
                        System.out.print("Enter new value Testscore " + i + ":");
                        testScores[i]= s.nextInt();


                        //s.nextLine();
                    }

                }

            }

        }while (false);

        return testScores;
    }


    public static int calculateAverage(int[] testScores) {

        int total = 0;
        for (int i : testScores) {
            total += i;
        }
        return total / (testScores.length);


    }
}
