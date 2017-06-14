import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Oefening8b {
    public static void main(String[] args) {

        int[] lottocijfers = new int[6];

        for (int a = 0; a < lottocijfers.length; a++) {

            lottocijfers[a] = pickuniquenumber(lottocijfers);


        }


        Arrays.sort(lottocijfers);
        System.out.print(Arrays.toString(lottocijfers));

    }


    public static int pickuniquenumber(int[] bestaande) {

        Random r = new Random();
        int candidate = r.nextInt(42) + 1;
        while (alreadyPicked(bestaande, candidate)) {
            candidate = r.nextInt(42) + 1;
        }

        return candidate;
    }

    public static boolean alreadyPicked(int[] bestaande, int candidate) {
        for (int i = 0; i < bestaande.length; i++) {
            if (bestaande[i] != 0 && bestaande[i] == candidate) {
                return true;
            }
        }
        return false;
    }
}













