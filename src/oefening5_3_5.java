/**
 * Created by vdabcursist on 14/06/2017.
 */
public class oefening5_3_5 {
    public static void main (String [] args){

        int ntalrijen = 8;
        int begin = 0;



        for (int i = ntalrijen; i > 0; i--) {

            for (int j = 1; j <= i*2; j++)
                System.out.print(" ");

            for (int j = 0; j<=begin; j++){
                double kwadraat = Math.pow(2,j);
                int kwadraatafgedrond = (int) Math.round(kwadraat);
                System.out.print(kwadraatafgedrond + " ");


            }

            //for (int j = begin-1; j>=1; j--){
                //System.out.print(Math.pow(2, j )+ " ");
            //}

            System.out.println();
            begin++;

    }
}}
