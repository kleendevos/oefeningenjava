/**
 * Created by vdabcursist on 14/06/2017.
 */
public class Oefening5_3_1 {
    public static void main(String[] args) {

        double harmonicsum = 0;
        for (int n = 1; n <= 50000; n++){
             harmonicsum += (1.0 / n);
            System.out.println(harmonicsum);
        }

    }
}
