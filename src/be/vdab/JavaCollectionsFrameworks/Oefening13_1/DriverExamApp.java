package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class DriverExamApp {
    public static void main (String [] args){

        System.out.println("Welcome to the Driver's License Exam");
        System.out.println("You get 20 Multiple-choice Questions - Mark with A, B, C or D");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("In order to pass your exam you need get a score of 15 out of 20");
        System.out.println("GOOD LUCK!");

        Scanner s = new Scanner(System.in);

        String[] answers = new String[20];
        String answer;

        for (int i = 0; i<20; i++){
            do {
                System.out.print("Question "+ (i+1) + ":");
                answer = s.next();
            } while (!(isValidAnswer(answer)));
            answers[i] = answer;

        } System.out.println('\n'+ "YOUR ANSWERS:  ");
        System.out.println(Arrays.toString(answers));

        DriverExam exam = new DriverExam(answers);
        System.out.println(" ");
        System.out.println(" ");


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("RESULTS");
        System.out.println("TOTAL CORRECT ANSWERS: " + exam.totalAnswersCorrect());
        System.out.println("TOTAL INCORRECT ANSWERS: " + exam.totalAnswersIncorrect());
        System.out.println(" ");
        System.out.println("" );

        String passed = exam.passed()? "PASSED":"FAILED";

        System.out.println("YOU " + passed);

    }

    public static boolean isValidAnswer (String answer){
        return "A".equalsIgnoreCase(answer) ||
                "B".equalsIgnoreCase(answer)|| "C".equalsIgnoreCase(answer)||"D".equalsIgnoreCase(answer);}
}
