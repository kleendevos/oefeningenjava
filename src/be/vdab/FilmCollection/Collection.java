package be.vdab.FilmCollection;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class Collection {
    public static void main (String [] args){

        String filmfile = "/Users/kathleendevos/Downloads/starters/films.txt";
        BufferedReader br = null;
        String line = " ";
        String Splitby = ",";

        try{

            br = new BufferedReader(new FileReader(filmfile));
            while ((line = br.readLine()) !=null) {
                String [] Film = line.split(Splitby);
                System.out.println(Arrays.toString (Film));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
