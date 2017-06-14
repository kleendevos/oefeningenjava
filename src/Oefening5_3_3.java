
public class Oefening5_3_3 {
    public static void main (String [] args){

        int max = 5000;
        int sign = 1;
        double sum = 0;


        for (int n =1; n < max; n+=2 ){

            sum += sign * (1.0/n);
            System.out.printf ("n=%d, sign=%d\n",n,sign);
            sign *= -1;
        }

        Double closetopi = 4*sum;
        System.out.println (closetopi);

    }
}
