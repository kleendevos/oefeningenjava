import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



/**
 * Created by kathleendevos on 12/06/17.
 */

public class oefening2_1 {
    public static void main (String [] args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Hello World!"+ " " + date + " " + time);
    }
}
