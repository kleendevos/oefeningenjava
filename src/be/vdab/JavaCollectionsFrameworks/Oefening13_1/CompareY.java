package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

import java.util.Comparator;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class CompareY implements Comparator<Point> {

    public int compare (Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();


        if (y1 > y2)
            return 1;
        else if (y1<y2)
            return -1;
        else if (x1>x2)
            return -1;
        else if (x1 < x2)
            return -1;
            else
                return 0;
            }


    }

