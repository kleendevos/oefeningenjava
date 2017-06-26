package be.vdab.JavaCollectionsFrameworks;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class Oefening13_1 {
    public static void main (String [] args){

        File f = new File("/Users/vdabcursist/Downloads/JAVA8-TALK.pdf");
        f.length();

        System.out.println((f.length()/1024)/1024.0 + " MB");















    }
}


