import java.util.Scanner;

public class arrays {
    public static void main (String [] args){


        Scanner sc = new Scanner(System.in);



        int[] list = new int [5];

        for (int j=0; j<list.length;j++){
            System.out.println("GEEF GETAL"+(j+1)+"VAN" +list.length);
            list[j]=sc.nextInt();

        }

        for (int j=0; j<list.length; j++){
            System.out.print (list[j] + " ");
        }










    }
}
