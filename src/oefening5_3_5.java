/**
 * Created by vdabcursist on 14/06/2017.
 */
public class oefening5_3_5 {
    public static void main (String [] args){

        int ntalrijen = 10;
        int rij = 1;


        for (int i = ntalrijen; i > 0; i--) {

            for (int j = 1; j <= i*2; j++)
                System.out.print(" ");

            for (int j = 1; j<=rij; j++)
                System.out.print(j+ " ");

            for (int j = rij-1; j>=1; j--)
                System.out.print(j+ " ");

            System.out.println();
            rij++;

    }
}}
