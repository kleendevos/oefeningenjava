package be.vdab.JavaIO;

import java.io.File;
import java.util.Scanner;

/**
 * Created by vdabcursist on 26/06/2017.
 */
public class RenameFile {
    public static void main (String [] args){
        File file = new File("/Users/vdabcursist/Desktop/test.txt");
        File newfile = new File ("/Users/vdabcursist/Desktop/test2.txt");

        if (file.renameTo(newfile)){
            if (true) {
                System.out.println ("Are you sure you want to rename the file? Y/N");
                Scanner s = new Scanner(System.in);
                s.nextLine();
                System.out.println("Your file will be renamed");
                if (true) {
                    System.out.println ("File Renamed");
                    return;

                }

            }
        } else {
            System.out.println ("File not found! Can't be renamed.");
        }

    }


}
