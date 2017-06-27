package be.vdab.JavaCollectionsFrameworks.Oefening13_1;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class runner {
    public static void main(String[] args) {

        Point[] points = new Point[4];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point((double) Math.random() * 100, (double) Math.random() * 100);
        }

        Arrays.sort(points);
        System.out.println("Points in increasing order of their x-coordinates:");
        for (Point p : points) {
            System.out.print(p.tostring());
        }

        Arrays.sort(points, new CompareY());
        System.out.println(" ");
        System.out.println('\n'+ "Points in increasing order of their x-coordinates:");
        for (Point p : points) {
            System.out.print(p.tostring());




        }
    }}








