package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

import java.util.Comparator;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class CompareY implements Comparator<Point> {

    public int compare(Point p1, Point p2) {
        if (p1.getY() != p2.getY()) {
            return (int) (p1.getY() - p2.getY());
        } else {
            return (int) (p1.getX() - p2.getX());
        }
    }


}

