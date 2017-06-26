package be.vdab.JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class Readingfile {
    public static void main (String []algs){

        File alice = new File ("/Users/vdabcursist/Desktop/fotos/Alice.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/vdabcursist/Desktop/fotos/Alice.txt")))

        { String line;
        while ((line = reader.readLine()) !=null) {
            System.out.println(line.replaceAll(" ", "").toUpperCase());

        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
