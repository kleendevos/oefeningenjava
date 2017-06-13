import java.util.Scanner;

public class Oefening5_2_1 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("MARK: ");
        int mark = sc.nextInt();

        if(mark>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            }

    }
}
