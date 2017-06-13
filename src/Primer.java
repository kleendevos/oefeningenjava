
public class Primer {
    public static boolean isprimenumber (int n){
        if (n<2){
            return false;

        }else {
            int deler = 2;
            while (deler < n-1) {
                int rest = n % deler;
                if (rest == 0){
                    return false;
                }
                deler++;
            }
            return true;
        }

    }
}
